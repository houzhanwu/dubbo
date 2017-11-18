package com.csht.lwlkdatasubscribe.thread;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import com.codahale.metrics.MetricRegistry;
import com.csht.lwlkdatasubscribe.Application;
import com.csht.lwlkdatasubscribe.config.MetricConfig;

@Component
public class SaveRedis extends Thread {
	@Resource(name = "userinfoRedisTemplate")
	private StringRedisTemplate vehinfoRedisTemplate;

	@Autowired
	private MetricRegistry metrics;

	private HashOperations<String, Object, Object> opsForHash = vehinfoRedisTemplate
			.opsForHash();

	@Override
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			if (Application.zmqsubMap.size() > 20000) {

				for (Map.Entry<String, Map<String, Object>> entry : Application.zmqsubMap
						.entrySet()) {

					opsForHash.putAll(entry.getKey(), entry.getValue());
					metrics.meter(MetricConfig.METRICS_USERINFO_REDIS_METER)
							.mark();
				}
			}

		}

	}
}
