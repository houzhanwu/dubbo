package com.csht.lwlkdatasubscribe.thread;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.zeromq.ZMQ;

import com.codahale.metrics.MetricRegistry;
import com.csht.lwlkdatasubscribe.Application;
import com.csht.lwlkdatasubscribe.config.ZmqConfig;
import com.csht.lwlkdatasubscribe.utils.CTTICZMQSUB;
import com.google.protobuf.InvalidProtocolBufferException;

@Component
public class ZmqSub extends Thread {

	private static ZMQ.Context context = ZMQ.context(1); // 创建1个I/O线程的上下文
	private static ZMQ.Socket subscriber = context.socket(ZMQ.SUB); // 创建一个sub类型，也就是subscriber类型的socket
	@Autowired
	private MetricRegistry metrics;

	@Autowired
	private ZmqConfig zmqConfig;

	@PostConstruct
	private void init() {
		subscriber.connect("tcp://" + zmqConfig.getSubhostName() + ":"
				+ zmqConfig.getSubport());

	}

	public void run() {
		CTTICZMQSUB.SubVehicle subVehicle = null;
		String pubTopic = "";
		int subCmd = 0;
		Map<String, Object> map = null;
		subscriber.subscribe("test");
		while (!Thread.currentThread().isInterrupted()) {

			byte[] message = subscriber.recv();
			String str = new String(message, 0, message.length);
			try {
				if (!str.equals("test")) {

					subVehicle = CTTICZMQSUB.SubVehicle.parseFrom(str
							.getBytes());

					String key = subVehicle.getVehicleNo() + "_"
							+ subVehicle.getVehicleColor();
					pubTopic = subVehicle.getPubTopic();
					subCmd = subVehicle.getSubCmd();
					// System.out.println(key + "  " + pubTopic + "  " +
					// subCmd);
					// System.out.println(Application.zmqsubMap.toString());
					if (Application.zmqsubMap.get(key) == null) {
						map = new ConcurrentHashMap<>();
						if (pubTopic != null && subCmd == 1) {
							// System.out.println("ok");
							map.put(pubTopic, "");
						}
						Application.zmqsubMap.put(key, map);
					} else {

						map = Application.zmqsubMap.get(key);
						if (subCmd == 1) {
							map.put(pubTopic, "");
						} else if (subCmd == 2) {
							map.remove(pubTopic);
							if (map.size() == 0) {
								Application.zmqsubMap.remove(key);
							}
						}

					}
					metrics.meter(
							com.csht.lwlkdatasubscribe.config.MetricConfig.METRICS_ZMQSUB_RECV_METER)
							.mark();
				}

			} catch (InvalidProtocolBufferException e) {
				e.printStackTrace();
			}

		}
	}

	@PreDestroy
	private void destroySub() {

		subscriber.close();
		context.term();
	}

}
