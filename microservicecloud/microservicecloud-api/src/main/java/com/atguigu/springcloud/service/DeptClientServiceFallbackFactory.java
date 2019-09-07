package com.atguigu.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.atguigu.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;


@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{

	@Override
	public DeptClientService create(Throwable cause) {
		return new DeptClientService(){

			@Override
			public Dept get(long id)
			{
				return new Dept().setDeptno(id).setDname("��ID��" + id + "û��û�ж�Ӧ����Ϣ,Consumer�ͻ����ṩ�Ľ�����Ϣ,�˿̷���Provider�Ѿ��ر�")
						.setDb_source("no this database in MySQL");
			}

			@Override
			public List<Dept> list() {
				
				return null;
			}

			@Override
			public boolean add(Dept dept) {
				
				return false;
			}
		};
			
	}

}
