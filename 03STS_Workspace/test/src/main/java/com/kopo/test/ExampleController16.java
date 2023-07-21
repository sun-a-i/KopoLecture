package com.kopo.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ExampleController16 {
	/*
	@ModelAttribute 는 뷰 페이지에서 공통으로 사용할 수 있는 커맨드 객체의 프로퍼티를 설정할 수 있음
	@RequestMapping 이 선언된 요청처리 메서드처럼 웹 URL 로는 불가!
	컨트롤러 안에 여러개 만들 수 있음
	*/
	
	
	//
	@GetMapping("/exam16")
	public String showForm() {
		return "exam14_03";
	}
	
	@ModelAttribute("title")
	public String setTitle() {
		return "@ModelAttribute 유형";
	}
	
	@ModelAttribute
	public void setsubTitle(Model model) {
		model.addAttribute("subtitle", "메서드에 @ModelAttribute 적용하기");
	}
}





