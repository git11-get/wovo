package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvider8002_App {

	public static void main(String[] args) {
		//DeptProvider8001_app.class:就是本微服务启动的主启动类
		SpringApplication.run(DeptProvider8002_App.class, args);

	}

}
