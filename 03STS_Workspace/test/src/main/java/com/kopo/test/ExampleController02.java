package com.kopo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExampleController02 {
	/*
	 @RequestMapping
	 
	 value = 기본 매핑 경로의 이름
	 method = 매핑할 http 요청 방식(get, post, head, options, put, delete, trace)
	 name = 매핑 이름 지정
	 params = 매핑된 요청 매개변수
	 path = 경로 매핑 url (서블릿 환경에서만 적용)
	 
	 방법 2가지 존재 
	 1. 클래스 수준의 매핑
	 2. 메서드 수준의 매핑
	  
	 */
	
	@RequestMapping(value = "/exam02")
	public void requestMethod() {
		System.out.println(" @RequestMapping 메서드 수준의 매핑 예제 ");
		System.out.println(" 웹 요청은 /exam02 ");
	}
}
