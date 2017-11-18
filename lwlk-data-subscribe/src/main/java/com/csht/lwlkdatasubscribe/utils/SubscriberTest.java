package com.csht.lwlkdatasubscribe.utils;

import java.io.IOException;
import java.util.StringTokenizer;

import org.zeromq.ZMQ;

public class SubscriberTest {
	public static void main(String args[]) throws IOException {
		// for (int j = 0; j < 10; j++) {
		// new Thread(new Runnable() {
		//
		// public void run() {
		// // TODO Auto-generated method stub
		// System.out.println(Thread.currentThread().getName());
		// ZMQ.Context context = ZMQ.context(1); // 创建1个I/O线程的上下文
		// ZMQ.Socket subscriber = context.socket(ZMQ.SUB); //
		// 创建一个sub类型，也就是subscriber类型的socket
		// subscriber.connect("tcp://127.0.0.1:5555"); //
		// 与在5555端口监听的publisher建立连接
		// subscriber.subscribe("fjs".getBytes()); // 订阅fjs这个channel
		// subscriber.subscribe("fjz".getBytes()); // 订阅fjs这个channel
		// subscriber.subscribe("fja".getBytes()); // 订阅fjs这个channel
		// // for (int i = 0; i < 100; i++) {
		// byte[] message = subscriber.recv(); // 接收publisher发送过来的消息
		// System.out.println("receive : " + new String(message));
		// // }
		// subscriber.close();
		// context.term();
		// }
		//
		// }).start();
		// }
		ZMQ.Context context = ZMQ.context(1);
		// Socket to talk to server
		System.out.println("Collecting updates from weather server");
		ZMQ.Socket subscriber = context.socket(ZMQ.SUB);
		subscriber.connect("tcp://localhost:5556");

		// Subscribe to zipcode, default is NYC, 10001
		String filter = (args.length > 0) ? args[0] : "10001 ";
		subscriber.subscribe(filter.getBytes());

		// Process 100 updates
		int update_nbr;
		long total_temp = 0;
		for (update_nbr = 0; update_nbr < 100; update_nbr++) {
			// Use trim to remove the tailing '0' character
			String string = subscriber.recvStr(0).trim();
			// System.out.println(string);
			StringTokenizer sscanf = new StringTokenizer(string, " ");
			// System.out.println(sscanf);
			int zipcode = Integer.valueOf(sscanf.nextToken());
			int temperature = Integer.valueOf(sscanf.nextToken());
			int relhumidity = Integer.valueOf(sscanf.nextToken());

			total_temp += temperature;
		}
		System.out.println("Average temperature for zipcode '" + filter
				+ "' was " + (int) (total_temp / update_nbr));
		System.out.println("...");
		int read = System.in.read();
		System.out.println(read);
		subscriber.close();
		context.term();
	}
}
