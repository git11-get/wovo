package com.atguigu.springcloud.controller;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DeptController {
	
	@Autowired
	private DeptService service = null;
	
	@RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
	@HystrixCommand(fallbackMethod="processHystrix_Get")
	public Dept get(@PathVariable("id") Long id){
		Dept dept = this.service.get(id);
		if(null == dept){
			throw new RuntimeException("��ID��" + id + "û�ж�Ӧ����Ϣ");
		}
		return dept;
	}
	
	public Dept processHystrix_Get(@PathVariable("id") Long id){
		
		return new Dept().setDeptno(id).setDname("��ID��" + id + "û�ж�Ӧ����Ϣ,null--@HystrixCommand")
				.setDb_source("no this database in MySQL");
	}
}