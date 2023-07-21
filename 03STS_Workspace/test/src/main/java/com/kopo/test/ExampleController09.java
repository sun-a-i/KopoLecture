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
	�� ��û URL�� ���� �Ķ���� ���� ���޹޴� ��Ʈ���� ����(matrix variable)
	
	context root/books/color;    year=2023;month=07
	context root/books;         color=red,green,blue
	
	@RequestMapping("��� ����")
	public string MethodName(@MatrixVariable ��Ʈ���� ����, ....) {}
	
	@RequestMapping("��� ����")
	public string MethodName(@MatrixVariable (��Ʈ���� ����) �Ű�����, ....) {}
	
	[�Ӽ� ����]
	defaultValue - �⺻������ ��ü 
	name - ��Ʈ���� ���� �̸�
	pathVar - ��Ʈ���� ������ �ִ� URI ��� ������ �̸�
	required - ��Ʈ���� ������ �䱸�Ǵ��� ����
	value - ��Ʈ�������� 'name=value' ���� name �� �ش��ϴ� ����
	 */
	
	// /exam09/abcd1234;category=������
	@GetMapping("/exam09/{bookId}")
	public String requestMethod(@PathVariable String bookId, 
								@MatrixVariable String category,
								Model model) {
		System.out.println("å�̸� : " + bookId);
		System.out.println("�з� : " + category);
		model.addAttribute("data", "å�̸� : " + bookId + "<br>" 
								+ "�з� : " + category);
		return "webpage06";
	}
}





