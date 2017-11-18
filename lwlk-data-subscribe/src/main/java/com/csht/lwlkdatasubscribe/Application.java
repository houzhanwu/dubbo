package com.csht.lwlkdatasubscribe;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static Map<String, Map<String, Object>> zmqsubMap = new ConcurrentHashMap<>();

	public static void main(String... args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.setWebEnvironment(false);
		app.run(args);
	}

}
