package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//��������������Զ�ע���eureka������
@EnableEurekaClient
//������
@EnableDiscoveryClient
//��hystrix�۶ϻ��Ƶ�֧��
@EnableCircuitBreaker
public class DeptProvider8001_Hystrix_App {

	public static void main(String[] args) {
		//DeptProvider8001_app.class:���Ǳ�΢������������������
		SpringApplication.run(DeptProvider8001_Hystrix_App.class, args);

	}

}
