package com.kopo.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class ExampleController04 {
	/*
	 Model = �𵨿� ���� �����͸� ����
	 
	 �� Ŭ����
	 Model = ������ ������ ���� - �������̽�
	 ���� : ������ �̸����� ������ �Ӽ��� ���
	 �Ű����� : 
	 - attributeName : �Ӽ��� �̸� - null ����
	 - attributeValue : �Ӽ��� �� - null ���
	 
	 ModelMap = ������ ������ ���� - ����ü 
	 	Model vs ModelMap : ���̰� ������, �ý��ۿ��� ó���Ǳ⿡ ��������� ��� Ȱ���ϴ� ������
	 ���� : ������ �̸����� ������ �Ӽ��� ���
	 �Ű����� : 
	 - attributeName : �Ӽ��� �̸� - null ����
	 - attributeValue : �Ӽ��� �� - null ���
	 	
	 ModelAndView = �� ���� �� �� ������ ����
	 */
	
	@GetMapping("/exam04")
	public String requestMethod(Model model) {		
		model.addAttribute("data", "Model ����");
		model.addAttribute("data2", "�� ��û : /home/exam04");
		return "webpage05";
	}
}
