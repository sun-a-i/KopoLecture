package com.kopo.sec;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class example03 {
	@GetMapping("/exam03")
	public String requestMethod(Model model) {
		return "webpage_03";
	}

	@GetMapping("/admin/tag")
	public String requestMethod2(Model model) {
		return "webpage_03";
	}
	
	/*
	 설정된 태그에서 현재 auth 정보 뽑아오기
	 
	 <security:authentication> 
	 
	 [속성]
	 property : 권한이 설정된 현재의 auth 객체 이름
	 scope : 권한이 설정된 영역
	 var : 사용자를 변수로 재정의
	 * */
}
