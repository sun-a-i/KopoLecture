package com.kopo.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ExampleController15 {
	/*
	스프링 폼태그 - 폼 태그 라이브러리 선언 후 사용	
	<%@ taglib prefix="form" uri = "http://www.springframework.org/tags/form" %>
	
	사용방법 : <form: 태그이름>
	
	[태그 종류]
	<form> = 폼의 시작과 끝에 붙음
	<input> = 일반 텍스트를 입력할 필드 
	<checkbox> = 다중 선택
	<checkboxes> = checkbox 목록
	<radiobutton> = 단일 선택
	<radiobuttons> = radio button 목록
	<password> = 비밀번호 * 로 현시
	<option> = <SELECT> 에 포함된 목록 구성
	<options> option 목록
	<textarea> = 여러 줄 텍스트 입력
	<hidden> = 웹에 출력 안됨
	<errors> = validation 오류 메시지	
	
	<form:form 속성1="값1" ...>
		// 태그 입력 - 양식 <input>, <textarea>
	</form:from>
	
	[form 속성]
	modelAttribute = 참조 객체 설정(※첫글자가 반드시 소문자)
	action = 처리 url 주소
	method = http 방식
	name = 폼 이름
	target = 응답 실행할 프레임 설정
	enctype =  MIME 설정
	accept-charset = 문자 인코딩 설정
	
	@ModelAttribute 이용한 데이터 바인딩
	요청 파라미터 값을 동적으로 도메인의 프로퍼티에 설정해주는 것
	도메인 객체의 프로퍼티 타입(int, char, boolean etc...)에 맞게 문자열을 변경 
	
	public String 메서드일음(@ModelAttribute 매개변수, Model model){}
	*/
	
	
	//
	@PostMapping("/member")
	/*
	public String showForm(@ModelAttribute("member") Member 나만의이름, Model model) {
	model.addAttribute("member", 나만의이름);
	 */
	public String showForm(@ModelAttribute Member member, Model model) {
		
		System.out.println("PostMapping --------");
		System.out.println("아이디 : " + member.getId());
		System.out.println("비밀번호 : " + member.getPassword());
		System.out.println("거주도시 : " + member.getCity());
		System.out.println("성별 : " + member.getSex());
		System.out.println("취미 : ");
		for(int i =0; i<member.getHobby().length; i++) {
			System.out.println("["+ member.getHobby()[i] +"]");
		}
				
		model.addAttribute("member", member);
		return "exam14_02";
	}
}





