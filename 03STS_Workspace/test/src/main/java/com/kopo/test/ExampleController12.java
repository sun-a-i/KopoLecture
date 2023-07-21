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
	
	

	// /exam12/abcd1234;publisher=���̹�;name=����ȸ��/������;publisher=īī��;author=�Ѹ�
	
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





