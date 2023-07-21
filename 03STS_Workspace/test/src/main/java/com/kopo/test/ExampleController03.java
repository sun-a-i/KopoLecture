package com.kopo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class ExampleController03 {
	/*
	 @RequestMapping 의 단순화
	 스프링 4.3 버전부터 지원
	 GET 방식인 경우 @GetMapping 애너테이션활용 가능(GET requestMapping라고 읽음)
	 @GetMapping	- 요청이 get
	 @PostMapping	- 요청이 post
	 @PutMapping	- 요청이 put
	 @DeleteMapping	- 요청이 delete
	 @PatchMapping	- 요청이 patch
	 */
	
	@GetMapping("/exam03")
	public void requestMethod() {		
		System.out.println(" @RequestMapping 예제 ");
		System.out.println(" 웹 요청은 /exam03 ");
	}
}
