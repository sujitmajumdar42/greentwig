package com.codestuff.greentwig.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DatabaseConfig {
	
	@Value("${app.db.url}")
	private String url;
	
	@Value("${app.db.username}")
	private String username;
	
	@Value("${app.db.password}")
	private String password;
	
	@Value("${app.db.driver}")
	private String driver;
	
	@Bean
	DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl(url);
		driverManagerDataSource.setUsername(username);
		driverManagerDataSource.setPassword(password);
		driverManagerDataSource.setDriverClassName(driver);
		return driverManagerDataSource;
	}
}
