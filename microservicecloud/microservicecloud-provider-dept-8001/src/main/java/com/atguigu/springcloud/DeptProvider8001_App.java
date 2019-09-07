package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvider8001_App {

	public static void main(String[] args) {
		//DeptProvider8001_app.class:���Ǳ�΢������������������
		SpringApplication.run(DeptProvider8001_App.class, args);

	}

}
