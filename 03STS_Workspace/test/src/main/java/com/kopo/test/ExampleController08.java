package com.kopo.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class ExampleController08 {
	/*
	��� ���� - @PathVariable
	�� ��û URL�� ���Ե� �Ķ���� ���� ���޹��� �� ����
	 {} �߰�ȣ�� Ȱ�� URL�� ���Ե� ��û ���� ���� ���޹���
	 
	 �����. 1
	 @RequestMapping("��� ����")
	 public string MethodName(@PathVariable ��κ���, ..){}
	 
	 �����. 2
	 @RequestMapping("��� ����")
	 public string MethodName(@PathVariable (��κ���) �Ű�����, ..){}
	 */
	
	@GetMapping("/exam08/{category}/publisher/{publisher}")
	public String requestMethod(@PathVariable String category, 
								@PathVariable String publisher,
								Model model) {
		System.out.println("�з� : " + category);
		System.out.println("���ǻ� : " + publisher);
		model.addAttribute("data", "�з� : " + category + "<br>" 
								+ "���ǻ� : " + publisher);
		return "webpage06";
	}
}





