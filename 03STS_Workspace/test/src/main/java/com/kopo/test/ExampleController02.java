package com.kopo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExampleController02 {
	/*
	 @RequestMapping
	 
	 value = �⺻ ���� ����� �̸�
	 method = ������ http ��û ���(get, post, head, options, put, delete, trace)
	 name = ���� �̸� ����
	 params = ���ε� ��û �Ű�����
	 path = ��� ���� url (���� ȯ�濡���� ����)
	 
	 ��� 2���� ���� 
	 1. Ŭ���� ������ ����
	 2. �޼��� ������ ����
	  
	 */
	
	@RequestMapping(value = "/exam02")
	public void requestMethod() {
		System.out.println(" @RequestMapping �޼��� ������ ���� ���� ");
		System.out.println(" �� ��û�� /exam02 ");
	}
}
