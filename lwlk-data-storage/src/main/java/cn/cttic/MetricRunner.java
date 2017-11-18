package cn.cttic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.MetricRegistry;

/**
 * @Component
 * @ClassName: MetricRunner
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author songwei
 * @date 2017年3月16日 下午1:11:48
 * 
 */
@Component
public class MetricRunner implements CommandLineRunner {

	@Autowired
	private ConsoleReporter consoleReporter;

	@Autowired
	private MetricRegistry metrics;

	@Override
	public void run(String... strings) throws Exception {

		File file = createLogFile();
		consoleReporter = ConsoleReporter.forRegistry(metrics)
				.outputTo(new PrintStream(new FileOutputStream(file))).build();
		consoleReporter.start(10, TimeUnit.SECONDS);
	}

	private File createLogFile() throws IOException {
		File file1 = new File(System.getProperty("user.dir") + "/logs/metric");
		if (!file1.exists()) {
			file1.mkdirs();
		}
		File file = new File(System.getProperty("user.dir") + "/logs/metric",
				"metric.txt");
		if (!file.exists()) {
			file.createNewFile();
		} else {
			// 大于4G删除
			if (file.length() > 4294967296L) {
				file.delete();
				file.createNewFile();
			}
		}
		return file;
	}
}
