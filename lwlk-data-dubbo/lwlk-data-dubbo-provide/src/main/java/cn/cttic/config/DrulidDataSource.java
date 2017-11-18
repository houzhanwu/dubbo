package cn.cttic.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DrulidDataSource {

	@Bean(initMethod = "init", destroyMethod = "close")
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource druidDataSource() {
		// DruidDataSource druidDataSource = new DruidDataSource();
		// druidDataSource.setDriverClassName(driver);
		// druidDataSource.setUrl(url);
		// druidDataSource.setUsername(username);
		// druidDataSource.setPassword(password);
		// druidDataSource.setInitialSize(2);
		// try {
		// // wall 防御sql注入，stat监控统计
		// druidDataSource.setFilters("stat, wall");
		// } catch (SQLException e) {
		// e.printStackTrace();
		// }
		return new DruidDataSource();
	}
}
