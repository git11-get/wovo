package com.atguigu.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@AllArgsConstructor //全参数构造函数
@NoArgsConstructor //空参数构造函数
@Data	//为每个属性设置getter、setter方法
@Accessors(chain=true)	//访问方式（现在流行的链式访问方式）
public class Dept implements Serializable {
	//主键
	private Long deptno;
	//部门名称
	private String dname;
	//来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	private String db_source;
	
	public Dept(String dname) {
		super();
		this.dname = dname;
	}
	

}
