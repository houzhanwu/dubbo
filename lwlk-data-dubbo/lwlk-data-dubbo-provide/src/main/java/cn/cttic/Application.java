package cn.cttic;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ComponentScan(value = "cn.cttic.*")
public class Application implements CommandLineRunner {

	@Autowired
	DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	public void run(String... strings) throws Exception {
		// 应用起来后,先尝试关闭db连接,避免一些冷门应用,无人访问占用连接资源，同时也测试db连接关闭是否正常
		try {
			System.out.println("db连接正常关闭");
			dataSource.getConnection().close();
		} catch (Exception e) {
		}
	}

}
