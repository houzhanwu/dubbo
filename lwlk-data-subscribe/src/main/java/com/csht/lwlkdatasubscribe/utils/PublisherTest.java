package com.csht.lwlkdatasubscribe.utils;

import java.util.Random;

import org.zeromq.ZMQ;

public class PublisherTest {
	public static void main(String args[]) {

		// ZMQ.Context context = ZMQ.context(1); // 创创建包含一个I/O线程的context
		// ZMQ.Socket publisher = context.socket(ZMQ.PUB); //
		// 创建一个publisher类型的socket，他可以向所有订阅的subscriber广播数据
		//
		// publisher.bind("tcp://127.0.0.1:5555"); //
		// 将当前publisher绑定到5555端口上，可以接受subscriber的订阅
		//
		// while (!Thread.currentThread().isInterrupted()) {
		// String message = "fjs hello"; //
		// 最开始可以理解为pub的channel，subscribe需要订阅fjs这个channel才能接收到消息
		// String message2 = "fjz hello2";
		// String message3 = "fja hello3";
		// publisher.send(message2.getBytes());
		// publisher.send(message3.getBytes());
		// publisher.send(message.getBytes());
		// }
		//
		// publisher.close();
		// context.term();
		// Prepare our context and publisher
		ZMQ.Context context = ZMQ.context(1);
		ZMQ.Socket publisher = context.socket(ZMQ.PUB);
		publisher.bind("tcp://*:5556");

		// Initialize random number generator
		Random srandom = new Random(System.currentTimeMillis());
		while (!Thread.currentThread().isInterrupted()) {
			// Get values that will fool the boss
			int zipcode, temperature, relhumidity;
			zipcode = 10000 + srandom.nextInt(10000);
			temperature = srandom.nextInt(215) - 80 + 1;
			relhumidity = srandom.nextInt(50) + 10 + 1;

			// Send message to all subscribers
			String update = String.format("%05d %d %d", zipcode, temperature,
					relhumidity);
			publisher.send(update, 0);
		}
		publisher.close();
		context.term();
	}
}
