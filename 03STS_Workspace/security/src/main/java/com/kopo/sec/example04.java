package com.kopo.sec;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class example04 {
	@GetMapping("/login")
	public String requestMethod(Model model) {
		return "loginform";
	}

	@GetMapping("/admin")
	public String requestMethod2(Model model) {
		return "webpage_04";
	}
	
	@GetMapping("/logout")
	public String logout(Model model) {
		return "loginform";
	}
	
	/*
	 <form-login> 태그
	 : 인증되지 않은 사용자가 특정 경로에 접근할 때 인증이 필요하면 로그인 페이지를 보여줌.
	 login-page  = 로그인 페이지 경로 지정
	 login-processing-url = 로그인 요청 -> 처리 경로를 지정
	 default-target-url = 로그인이 성공하면 이동할 페이지
	 username-parameter = 계정의 이름
	 password-parameter = 계정의 비밀번호
	 authentication-failure-url = 로그인 실패하면 이동할 경로  
	 always-user-default-target = boolean 형으로 true로 설정하면  
	 							  설정된경로(default-target-url)로 시작
	 							  
	logout 태그
	- delete-cookies : 로그아웃에 성공할 때 삭제할 쿠키 이름
	- invalidate-session : 로그아웃할 때 세션을 제거할지 말지, default : True
	- logout-success-url : 로그아웃하고 이동할 페이지 default : /login?logout
	- logout-url :로그아웃 요청 -> 처리할 경로
	- success-handler-ref : 로그아웃에 성공할 때 이동을 제어하는 핸들러
	 */
}













