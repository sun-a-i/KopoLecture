package com.springmvc.chap12;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Example01Controller {
	
	@GetMapping("/exam01")	
	public String requestMethod() {	     	
	      return "webpage12_01";
	}	

}
