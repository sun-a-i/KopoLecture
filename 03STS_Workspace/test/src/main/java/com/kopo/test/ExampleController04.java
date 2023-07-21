package com.kopo.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class ExampleController04 {
	/*
	 Model = 모델에 응답 데이터를 저장
	 
	 모델 클래스
	 Model = 데이터 정보를 저장 - 인터페이스
	 역할 : 제공된 이름으로 제공된 속성을 등록
	 매개변수 : 
	 - attributeName : 속성의 이름 - null 불허
	 - attributeValue : 속성의 값 - null 허용
	 
	 ModelMap = 데이터 정보를 저장 - 구현체 
	 	Model vs ModelMap : 차이가 있으나, 시스템에서 처리되기에 결과적으로 어떤걸 활용하던 동일함
	 역할 : 제공된 이름으로 제공된 속성을 등록
	 매개변수 : 
	 - attributeName : 속성의 이름 - null 불허
	 - attributeValue : 속성의 값 - null 허용
	 	
	 ModelAndView = 모델 정보 및 뷰 정보를 저장
	 */
	
	@GetMapping("/exam04")
	public String requestMethod(Model model) {		
		model.addAttribute("data", "Model 예제");
		model.addAttribute("data2", "웹 요청 : /home/exam04");
		return "webpage05";
	}
}
