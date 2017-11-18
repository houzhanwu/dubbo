package com.csht.lwlkdatasubscribe;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.Gauge;
import com.codahale.metrics.MetricRegistry;
import com.csht.lwlkdatasubscribe.config.MetricConfig;
import com.csht.lwlkdatasubscribe.thread.ZmqPub;

/**
 * 
 * @author hezhaopeng
 *
 */
@Component
public class MetricRunner implements CommandLineRunner {

	@Autowired
	private ConsoleReporter consoleReporter;

	@Autowired
	private MetricRegistry metrics;

	@Override
	public void run(String... strings) throws Exception {

		Gauge<Integer> crobasket = new Gauge<Integer>() {
			@Override
			public Integer getValue() {
				return ZmqPub.zmqPubQueue.size();
			}
		};

		metrics.register(MetricConfig.METRICS_ZMQPUB_QUEUE_SIZE, crobasket);

		Gauge<Integer> basket = new Gauge<Integer>() {
			@Override
			public Integer getValue() {
				return Application.zmqsubMap.size();
			}
		};

		metrics.register(MetricConfig.METRICS_ZMQSUB_MAP_SIZE, basket);
		consoleReporter.start(20, TimeUnit.SECONDS);

	}

}
