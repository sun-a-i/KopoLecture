package com.kopo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class ExampleController03 {
	/*
	 @RequestMapping �� �ܼ�ȭ
	 ������ 4.3 �������� ����
	 GET ����� ��� @GetMapping �ֳ����̼�Ȱ�� ����(GET requestMapping��� ����)
	 @GetMapping	- ��û�� get
	 @PostMapping	- ��û�� post
	 @PutMapping	- ��û�� put
	 @DeleteMapping	- ��û�� delete
	 @PatchMapping	- ��û�� patch
	 */
	
	@GetMapping("/exam03")
	public void requestMethod() {		
		System.out.println(" @RequestMapping ���� ");
		System.out.println(" �� ��û�� /exam03 ");
	}
}
