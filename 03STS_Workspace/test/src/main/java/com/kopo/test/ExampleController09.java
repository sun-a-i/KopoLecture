package com.kopo.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class ExampleController09 {
	/*
	웹 요청 URL에 다중 파라미터 값을 전달받는 매트릭스 변수(matrix variable)
	
	context root/books/color;    year=2023;month=07
	context root/books;         color=red,green,blue
	
	@RequestMapping("경로 변수")
	public string MethodName(@MatrixVariable 매트릭스 변수, ....) {}
	
	@RequestMapping("경로 변수")
	public string MethodName(@MatrixVariable (매트릭스 변수) 매개변수, ....) {}
	
	[속성 종류]
	defaultValue - 기본값으로 대체 
	name - 매트릭스 변수 이름
	pathVar - 매트릭스 변수가 있는 URI 경로 변수의 이름
	required - 매트릭스 변수가 요구되는지 여부
	value - 매트릭스변수 'name=value' 에서 name 에 해당하는 영역
	 */
	
	// /exam09/abcd1234;category=무협지
	@GetMapping("/exam09/{bookId}")
	public String requestMethod(@PathVariable String bookId, 
								@MatrixVariable String category,
								Model model) {
		System.out.println("책이름 : " + bookId);
		System.out.println("분류 : " + category);
		model.addAttribute("data", "책이름 : " + bookId + "<br>" 
								+ "분류 : " + category);
		return "webpage06";
	}
}





