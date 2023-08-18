package com.springmvc.chap10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Example03Controller {
	@GetMapping("/exam03")
    public void handleRequest () {
        throw new Example03Exception();
    }
	
	@ExceptionHandler(Example03Exception.class)
	public ModelAndView handleException(Example03Exception ex) {

		ModelAndView model = new ModelAndView();		
		model.addObject("errorMassage", ex.getErrMsg());		
		model.addObject("exception", ex);
		model.setViewName("webpage10_03");

		return model;
	}

}
