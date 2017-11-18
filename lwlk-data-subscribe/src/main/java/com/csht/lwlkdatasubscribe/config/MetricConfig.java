package com.csht.lwlkdatasubscribe.config;

import java.io.File;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.CsvReporter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Slf4jReporter;

/**
 * 
 * @ClassName: MetricConfig
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author songwei
 * @date 2017年3月16日 下午1:12:09
 * 
 */
@Configuration
public class MetricConfig {

	public final static String METRICS_KAFKA_LWLKANDHYPT_METER = "meter.kafka.lwlkandhypt";
	public final static String METRICS_USERINFO_REDIS_METER = "meter.userinfo.redis";

	public final static String METRICS_ZMQPUB_SEND_METER = "meter.zmqpub.send";
	public final static String METRICS_ZMQSUB_RECV_METER = "meter.zmqsub.recv";
	public final static String METRICS_ZMQSUB_MAP_SIZE = "meter.zmqsub.map.size";

	public final static String METRICS_ZMQPUB_QUEUE_SIZE = "meter.zmqpub.queue.size";

	@Bean
	public MetricRegistry metrics() {
		return new MetricRegistry();
	}

	@Bean
	public ConsoleReporter consoleReporter(MetricRegistry metrics) {
		return ConsoleReporter.forRegistry(metrics)
				.convertRatesTo(TimeUnit.SECONDS)
				.convertDurationsTo(TimeUnit.MILLISECONDS).build();
	}

	@Bean
	public Slf4jReporter slf4jReporter(MetricRegistry metrics) {
		return Slf4jReporter
				.forRegistry(metrics)
				.outputTo(
						LoggerFactory
								.getLogger("com.csht.lwlkdatasubscribe.metrics"))
				.convertRatesTo(TimeUnit.SECONDS)
				.convertDurationsTo(TimeUnit.MILLISECONDS).build();
	}

	@Bean
	public CsvReporter csvReporter(MetricRegistry metrics) {
		return CsvReporter.forRegistry(metrics).formatFor(Locale.US)
				.convertRatesTo(TimeUnit.SECONDS)
				.convertDurationsTo(TimeUnit.MILLISECONDS)
				.build(new File("~/projects/data/"));
	}

}
