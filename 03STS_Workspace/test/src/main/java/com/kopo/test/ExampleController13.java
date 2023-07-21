package com.kopo.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class ExampleController13 {
	/*
	@RequestParam 속성
	defaultValue = 요청매개변수가 없거나 빈값이면 기본값 처리
	name = 매개변수 이름
	required = 요청 매개변수가 요구가 되는지 여부 설정
	value = name() 별칭
	*/
	
	// /exam13?id=1234
	@GetMapping("/exam13")
	public String requestMethod(@RequestParam String id, Model model) {
		System.out.println("도서의 ID : " + id);
		model.addAttribute("data", "도서의 id : " + id);
		
		return "webpage06";
	}
}





