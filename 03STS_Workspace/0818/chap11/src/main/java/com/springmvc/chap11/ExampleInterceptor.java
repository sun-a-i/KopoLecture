package com.springmvc.chap11;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class ExampleInterceptor implements HandlerInterceptor{
	public Logger logger = LoggerFactory.getLogger(ExampleInterceptor.class);

	public boolean preHandle(HttpServletRequest request, 
			  					HttpServletResponse response, 
	                            Object handler) throws Exception {		  
	    logger.info("preHandle() ȣ��......");
	    if (handler instanceof HandlerMethod) {
	    	HandlerMethod method = (HandlerMethod) handler; 
	    	logger.info("�ڵ鷯 �޼ҵ�� : " + method.getMethod().getName()); 
	    }
	    return true;
	}
	public void postHandle(HttpServletRequest arg0, HttpServletResponse response, 
	                         Object handler, ModelAndView modelAndView) throws Exception {
		logger.info("postHandle() ȣ��......");
	}
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, 
	                             Object handler, Exception exception) throws Exception {
		 logger.info("afterCompletion() ȣ��......");
	}	
}
