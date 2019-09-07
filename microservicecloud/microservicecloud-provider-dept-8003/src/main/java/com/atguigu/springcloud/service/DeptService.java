package com.atguigu.springcloud.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.atguigu.springcloud.entities.Dept;


@Transactional
public interface DeptService {
	
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();

}
