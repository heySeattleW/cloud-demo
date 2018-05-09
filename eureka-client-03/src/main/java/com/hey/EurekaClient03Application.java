package com.hey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClient03Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient03Application.class, args);
	}
}
