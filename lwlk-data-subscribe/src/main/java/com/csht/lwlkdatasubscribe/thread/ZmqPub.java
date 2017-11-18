package com.csht.lwlkdatasubscribe.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.zeromq.ZMQ;

import com.codahale.metrics.MetricRegistry;
import com.csht.lwlkdatasubscribe.Application;
import com.csht.lwlkdatasubscribe.config.ZmqConfig;
import com.csht.lwlkdatasubscribe.modle.Vehicle;

@Component
public class ZmqPub extends Thread {

	@Autowired
	private MetricRegistry metrics;
	@Autowired
	private ZmqConfig zmqConfig;

	public static BlockingQueue<Vehicle> zmqPubQueue = new LinkedBlockingQueue<>(
			10000000);

	private static ZMQ.Context context = ZMQ.context(1); // 创创建包含一个I/O线程的context
	private static ZMQ.Socket publisher = context.socket(ZMQ.PUB); // 创建一个publisher类型的socket，他可以向所有订阅的subscriber广播数据

	@PostConstruct
	private void initPub() {
		publisher.bind("tcp://" + zmqConfig.getPubhostName() + ":"
				+ zmqConfig.getPubport()); // 将当前publisher绑定到???端口上，可以接受subscriber的订阅
	}

	public void run() {
		String message = "";
		Map<String, Object> value = null;
		List<Vehicle> vehlist = null;
		while (!Thread.currentThread().isInterrupted()) {

			if (zmqPubQueue != null && zmqPubQueue.size() > 0) {
				vehlist = new ArrayList<>();
				zmqPubQueue.drainTo(vehlist, 10000);

				for (Vehicle vehicle : vehlist) {

					if (Application.zmqsubMap.containsKey((vehicle
							.getVehicleno() + "_" + vehicle.getPlatecolor()))) {
						value = Application.zmqsubMap
								.get((vehicle.getVehicleno() + "_" + vehicle
										.getPlatecolor()));

						for (Map.Entry<String, Object> entry2 : value
								.entrySet()) {
							publisher.send(entry2.getKey()
									.getBytes(ZMQ.CHARSET), ZMQ.SNDMORE);
							publisher.send(
									(vehicle.getVehicleno() + "_" + vehicle
											.getPlatecolor())
											.getBytes(ZMQ.CHARSET), 0);
							metrics.meter(
									com.csht.lwlkdatasubscribe.config.MetricConfig.METRICS_ZMQPUB_SEND_METER)
									.mark();

						}

					}

				}
			}
		}
	}

	@PreDestroy
	private void destroyPub() {
		publisher.close();
		context.term();
	}

}
