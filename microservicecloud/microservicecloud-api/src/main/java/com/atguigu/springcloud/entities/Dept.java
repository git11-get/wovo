package com.atguigu.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@AllArgsConstructor //ȫ�������캯��
@NoArgsConstructor //�ղ������캯��
@Data	//Ϊÿ����������getter��setter����
@Accessors(chain=true)	//���ʷ�ʽ���������е���ʽ���ʷ�ʽ��
public class Dept implements Serializable {
	//����
	private Long deptno;
	//��������
	private String dname;
	//�����ĸ����ݿ⣬��Ϊ΢����ܹ�����һ�������Ӧһ�����ݿ⣬ͬһ����Ϣ���洢����ͬ���ݿ�
	private String db_source;
	
	public Dept(String dname) {
		super();
		this.dname = dname;
	}
	

}
