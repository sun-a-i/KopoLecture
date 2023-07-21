package com.kopo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kopo.domain.Webtoon;
import com.kopo.service.WebtoonService;
/*
도메인 : 데이터 모델, 객체 정보 저장

퍼시스턴스 계층 : 데이터 액세스 계층, 데이터 처리

서비스 계층 : 비즈니스 계층, 애플리케이션이 제공하는 전반인적 서비스를 처리, 프레젠테이션 계층과 퍼시스턴스 계층을 연결하는 역할

프레젠테이션 계층 : 애플리케이션 최종 접점
- 사용자에게 데이터를 입력받거나, 결과를 웹으로 전달해주는 계층
- 처리 & 결과 담당
*/

@Controller
public class WebtoonController {
	@Autowired
	private WebtoonService webtoonService;
	
	@RequestMapping(value = "/webtoons", method=RequestMethod.GET)
	public String requestWebtoonList(Model model) {
		List<Webtoon> list = webtoonService.getAllWebtoonList();
		model.addAttribute("webtoonList", list);
		return "webtoons";
	}
}
