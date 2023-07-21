package com.kopo.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class ExampleController12 {
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
	
	

	// /exam12/abcd1234;publisher=네이버;name=광마회귀/무협지;publisher=카카오;author=둘리
	
	@GetMapping("/exam12/{bookId}/{category}")
	public String requestMethod
			(@MatrixVariable(pathVar="bookId") MultiValueMap<String, String> matrixVars,
			 @MatrixVariable(pathVar="category") MultiValueMap<String, String> matrixVars2, 
			 @MatrixVariable MultiValueMap<String, String> matrixVars3,
			 Model model) {
		System.out.println(matrixVars);
		System.out.println(matrixVars2);
		model.addAttribute("data", matrixVars + "<br>" + matrixVars2 + "<br>" + matrixVars3);
		
		return "webpage06";
	}
}





