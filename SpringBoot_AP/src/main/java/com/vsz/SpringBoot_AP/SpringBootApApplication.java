package com.vsz.SpringBoot_AP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringBootApApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApApplication.class, args);
	}

}