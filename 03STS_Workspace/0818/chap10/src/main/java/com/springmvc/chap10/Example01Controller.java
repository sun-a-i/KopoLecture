package com.springmvc.chap10;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class Example01Controller {
	/*
	 * code : ���信 ���Ǵ� ���� �ڵ�
	 * reason : ���信 ���Ǵ� ������ ����
	 * value : �ڵ忡 ���� ��Ī
	 * 
	 * */
	@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="��û �����߽��ϴ�.")
	@GetMapping("/exam01")
	public String  requestMethod(Model model) {
		System.out.println("chap10_01 �����Դϴ�"); //serealizable
		model.addAttribute("data", "@ResponseStatus ó�� �����Դϴ�");	
		
		return "webpage10_01";
		
    }
}
