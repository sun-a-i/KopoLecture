package com.kopo.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class ExampleController06 {
	/*
	 Model = 모델에 응답 데이터를 저장
	 ModelAndView = 모델 정보 및 뷰 정보를 저장
 	 
 	 void setViewName(String viewName)
 	 역할 : ModelAndView 뷰 이름을 설정
	 매개변수 : 
		- viewName : 뷰 이름	
		
			Model 			vs 	ModelAndView
	뷰data:  addAttribute()	   	 addObject()
	뷰이름 :  X(return 으로 결정)	 setViewName()
	 */
	
	@GetMapping("/exam06")
	public ModelAndView requestMethod(ModelMap model) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("data", "ModelAndView 예제");
		mav.addObject("data2", "웹 요청은 /home/exam06");
		mav.setViewName("webpage05");
		return mav;
	}
}
