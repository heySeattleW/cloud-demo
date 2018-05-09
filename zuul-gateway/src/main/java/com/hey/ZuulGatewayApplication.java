package com.hey;

import com.hey.filter.ErrorFilter;
import com.hey.filter.SampleFilter;
import com.hey.processor.DidiFilterProcessor;
import com.netflix.zuul.FilterProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class ZuulGatewayApplication {

	public static void main(String[] args) {
		FilterProcessor.setProcessor(new DidiFilterProcessor());//扩展自定义过滤器，目的是确认异常来自哪个阶段
		SpringApplication.run(ZuulGatewayApplication.class, args);
	}

	@Bean
	public SampleFilter sampleFilter(){
		return new SampleFilter();
	}

	@Bean
	public ErrorFilter errorFilter(){
		return new ErrorFilter();
	}
}
