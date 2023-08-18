package com.springmvc.chap11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Example02Controller {
	public Logger logger = LoggerFactory.getLogger(ExampleInterceptor.class);
	@GetMapping("/exam02")	
	public String requestMethod(Model model) {
		  logger.info("��������  webpage11_02 ȣ��");		
	   	  model.addAttribute("data", "���ͼ��� �����Դϴ�");
	   	  model.addAttribute("data2", "�� ��û URL��  /exam02 �Դϴ�");	   	
	      return "webpage11_02";
	   }
}
