package cn.cttic;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import cn.cttic.utils.FileUtil;

@ComponentScan
@EnableAutoConfiguration
@EnableScheduling
@Configuration
public class Application {
	public static List<File> allPathResult = new ArrayList<File>();
	static Logger logger = Logger.getLogger(Application.class);

	public static void main(String[] args) {
		logger.info("*****************************");
		FileUtil.getAllPath("/home/data/fp");
		// FileUtil.getAllPath("C:\\Users\\hezhaopeng\\Desktop\\data_00\\data_00");
		// FileUtil.getAllPath("C:\\Users\\hezhaopeng\\Desktop\\新建文件夹 (5)");

		Collections.sort(allPathResult, new FileUtil.CompratorByLastModified());
		for (File file : allPathResult) {
			logger.info(file.getAbsolutePath());
		}
		logger.info("allPathResult.size()   " + allPathResult.size());
		SpringApplication.run(Application.class, args);
	}
}