package com.hey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@EnableAutoConfiguration
@EnableTurbine
@EnableEurekaClient
@SpringBootApplication
public class HystrixTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixTurbineApplication.class, args);
	}
}
