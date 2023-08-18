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
		  logger.info("뷰페이지  webpage11_02 호출");		
	   	  model.addAttribute("data", "인터셉터 예제입니다");
	   	  model.addAttribute("data2", "웹 요청 URL은  /exam02 입니다");	   	
	      return "webpage11_02";
	   }
}
