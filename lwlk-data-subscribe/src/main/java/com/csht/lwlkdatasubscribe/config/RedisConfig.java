package com.csht.lwlkdatasubscribe.config;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class RedisConfig {
	static Logger logger = Logger.getLogger(RedisConfig.class);

	@Bean(name = "userinfoRedisTemplate")
	public StringRedisTemplate vehinfoRedisTemplate(
			@Value("${userinfoRedisTemplate.hostName}") String hostName,
			@Value("${userinfoRedisTemplate.port}") int port,
			@Value("${userinfoRedisTemplate.timeout}") int timeout) {
		StringRedisTemplate temple = new StringRedisTemplate();
		temple.setConnectionFactory(connectionFactory(hostName, port, timeout));
		logger.info("创建userinfoRedisTemplate对象  :" + temple);
		return temple;
	}

	public JedisConnectionFactory connectionFactory(String hostName, int port) {
		JedisConnectionFactory jedis = new JedisConnectionFactory();
		jedis.setHostName(hostName);
		jedis.setPort(port);

		jedis.setPoolConfig(poolCofig());
		// 初始化连接pool
		jedis.afterPropertiesSet();
		// RedisConnectionFactory factory = jedis;
		return jedis;
	}

	public JedisConnectionFactory connectionFactory(String hostName, int port,
			int timeout) {
		JedisConnectionFactory jedis = new JedisConnectionFactory();
		jedis.setHostName(hostName);
		jedis.setPort(port);
		// System.out.println(Protocol.DEFAULT_TIMEOUT);
		jedis.setTimeout(timeout);
		jedis.setPoolConfig(poolCofig());
		// 初始化连接pool
		jedis.afterPropertiesSet();

		return jedis;
	}

	public JedisPoolConfig poolCofig() {
		JedisPoolConfig poolCofig = new JedisPoolConfig();
		return poolCofig;
	}
}
