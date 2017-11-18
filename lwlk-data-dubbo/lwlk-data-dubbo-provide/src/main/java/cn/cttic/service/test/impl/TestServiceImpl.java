package cn.cttic.service.test.impl;

import cn.cttic.service.test.TestService;

import com.alibaba.dubbo.config.annotation.Service;

@Service(group = "testService", version = "1.0")
public class TestServiceImpl implements TestService {

	@Override
	public void testService() {
		System.out.println("oooooooooooooooooooookkkkkkkkkkkkkkkkkkkkkkkkk");
		System.out.println("oooooooooooooooooooookkkkkkkkkkkkkkkkkkkkkkkkk");
		System.out.println("oooooooooooooooooooookkkkkkkkkkkkkkkkkkkkkkkkk");
		System.out.println("oooooooooooooooooooookkkkkkkkkkkkkkkkkkkkkkkkk");
		System.out.println("oooooooooooooooooooookkkkkkkkkkkkkkkkkkkkkkkkk");
	}

}
