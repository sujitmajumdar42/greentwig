package com.codestuff.greentwig.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.codestuff.greentwig", exclude = {DataSourceAutoConfiguration.class })
@ComponentScan("com.codestuff.greentwig")
public class GreentwigApplication {
	
	@Value("${app.db.url}")
	private String url;
	
	public static void main(String[] args) {
		SpringApplication.run(GreentwigApplication.class, args);
	}
	
	@Bean
	public String testBean() {
		System.out.println("Database URL:"+url);
		return "OK";
	}
	

}
