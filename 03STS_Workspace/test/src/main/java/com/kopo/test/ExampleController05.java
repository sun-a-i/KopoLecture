package com.kopo.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class ExampleController05 {
	/*
	 Model = �𵨿� ���� �����͸� ����
	  
	 ModelMap = ������ ������ ���� - ����ü 
	 	Model vs ModelMap : ���̰� ������, �ý��ۿ��� ó���Ǳ⿡ ��������� ��� Ȱ���ϴ� ������
	 ���� : ������ �̸����� ������ �Ӽ��� ���
	 �Ű����� : 
	 - attributeName : �Ӽ��� �̸� - null ����
	 - attributeValue : �Ӽ��� �� - null ���
	 	
	 ModelAndView = �� ���� �� �� ������ ����
	 */
	
	@GetMapping("/exam05")
	public String requestMethod(ModelMap model) {		
		model.addAttribute("data", "ModelMap ����");
		model.addAttribute("data2", "�� ��û : /home/exam05");
		return "webpage05";
	}
}
