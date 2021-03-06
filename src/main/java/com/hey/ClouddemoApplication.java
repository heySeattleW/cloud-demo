package com.hey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ClouddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClouddemoApplication.class, args);
	}
}
