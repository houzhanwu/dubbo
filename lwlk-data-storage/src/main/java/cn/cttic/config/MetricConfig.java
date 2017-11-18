package cn.cttic.config;

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

	public final static String METRICS_INTO_HBASE = "cn.cttic.thread.JoinHbaseThread";
	public final static String METRICS_INTO_HDFS = "cn.cttic.thread.JoinHdfsThread";

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
								.getLogger("com.csht.datapositioncache.metrics"))
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

	// @Bean
	// public Meter requestMeter(MetricRegistry metrics) {
	// return metrics.meter("request");
	// }

}
