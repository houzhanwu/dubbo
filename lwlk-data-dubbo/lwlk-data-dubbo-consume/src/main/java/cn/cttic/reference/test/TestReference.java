package cn.cttic.reference.test;

import org.springframework.stereotype.Service;

import cn.cttic.service.test.TestService;

import com.alibaba.dubbo.config.annotation.Reference;

@Service
public class TestReference {

	@Reference(group = "testService", version = "1.0")
	private TestService testService;

	public void testService() {
		testService.testService();
	}

}
