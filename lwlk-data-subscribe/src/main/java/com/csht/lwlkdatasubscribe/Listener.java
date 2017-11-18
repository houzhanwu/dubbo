package com.csht.lwlkdatasubscribe;

import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import com.csht.lwlkdatasubscribe.thread.SaveRedis;
import com.csht.lwlkdatasubscribe.thread.ZmqPub;
import com.csht.lwlkdatasubscribe.thread.ZmqSub;

/**
 * 
 * @author hezhaopeng
 *
 */
@Component
public class Listener implements ApplicationListener<ApplicationReadyEvent> {
	private final static Logger LOG = LoggerFactory.getLogger(Listener.class);
	@Resource(name = "userinfoRedisTemplate")
	private StringRedisTemplate vehinfoRedisTemplate;
	@Resource(name = "userinfoRedisTemplate")
	private HashOperations<String, String, Object> opsForHash;
	@Autowired
	private ZmqPub zmqPub;
	@Autowired
	private ZmqSub zmqSub;
	@Autowired
	private SaveRedis saveRedis;

	@Override
	public void onApplicationEvent(final ApplicationReadyEvent event) {

		LOG.info("Listener已启动。。。。。。。。。。。。。。。。");
		syncRedis();
		LOG.info("同步redis完成。。。。。。。。。。。。。。。。");
		LOG.info("ZmqPub线程已启动。。。。。。。。。。。。。。。。");
		zmqPub.start();

		LOG.info("ZmqSub线程已启动。。。。。。。。。。。。。。。。");
		zmqSub.start();
		LOG.info("SaveRedis线程已启动。。。。。。。。。。。。。。。。");
		saveRedis.start();
	}

	public void syncRedis() {
		Set<String> keys = vehinfoRedisTemplate.keys("*");
		Map<String, Object> entries = null;
		for (String string : keys) {
			entries = opsForHash.entries(string);
			Application.zmqsubMap.put(string, entries);
		}
	}

}