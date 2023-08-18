package com.springmvc.chap10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Example04Controller {
	@GetMapping("/exam04")
    public void handleRequest () {
        throw new Example03Exception();
    }	

}
