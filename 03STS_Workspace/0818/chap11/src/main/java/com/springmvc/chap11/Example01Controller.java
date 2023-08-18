package com.springmvc.chap11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Example01Controller {
	/*log4j�� ������� : logger, appender, layout
	 * */
	public static Logger logger = LoggerFactory.getLogger(Example01Controller.class);
	@GetMapping("/exam01")
	public String  requestMethod(Model model) {
		logger.trace("Trace �޽���!");
        logger.debug("Debug �޽���!");
        logger.info("Info �޽���!");
        logger.warn("Warn �޽���!");
        logger.error("Error �޽���!"); 
        return "webpage11_01";	
	}
}
