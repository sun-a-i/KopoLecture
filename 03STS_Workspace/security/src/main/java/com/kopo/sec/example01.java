package com.kopo.sec;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class example01 {
	@GetMapping("/exam01")
	public String requestMethod(Model model) {
		return "webpage_01";
	}
	
	@GetMapping("/admin/main")
	public String requestMethod2(Model model) {
		model.addAttribute("data", "/webpage/adminPage.jsp");
		return "webpage/adminPage";
	}
	
	@GetMapping("/manager/main")
	public String requestMethod3(Model model) {
		model.addAttribute("data", "/webpage/managerPage.jsp");
		return "webpage/managerPage";
	}
	
	@GetMapping("/member/main")
	public String requestMethod4(Model model) {
		model.addAttribute("data", "/webpage/memberPage.jsp");
		return "webpage/memberPage";
	}
	
	@GetMapping("/home/main")
	public String requestMethod5(Model model) {
		model.addAttribute("data", "/webpage/homePage.jsp");
		return "webpage/homePage";
	}
}

/*
스프링 시큐리티 태그
<http> : 시작과 끝  </http>
<intercept-url> : 감시해야할 URL - 권한을 확인 -> 접근 가능한지 유무 판단
<form-login> : 로그인 설정
<logout> : 로그아웃 설정
<authentication-manager> : 사용자 권한 서비스의 시작/끝
<authentication-provider> : 사용자 정보를 인증 요청
<user-service> : 사용자 정보 가져오기
<user> : 사용자 정보 나타내는데 사용

접근 권한
접근 권한을 설정하는 시큐리티 태그를 활용 : 
<http> 
auto-config -> 기본 보안 서비스가 자동으로 설정
use-expressions -> <intercept-url> 안에 access 속성에서 SpEL 언어를 사용할지 유무

SpEL : Spring Expression Language 스프링 표현언어
웹언어 jsp, jsf 다양함 -> 통합표현언어

EX)
<http auto-config='true' use-expressions="true">
//
</http>

<intercept-url> 속성
pattern - ant 경로 패턴, *, ** 을 사용해서 접근 경로 설정
access - pattern 에 설정된 경로로 접근할 수 있게 권한 부여
requires-channel - URL로 접근하면 리다이렉션

EX)
<http auto-config='true' use-expressions="true">
	<intercept-url pattern="/admin/**" access="hasAuthority('ROLE_ADMIN')"/> 
	<intercept-url pattern="/manager/**" access="hasAuthority('ROLE_MANAGER')"/> 
	<intercept-url pattern="/member/**" access="hasAuthority('ROLE_GUEST')"/> 
</http>

/admin/main/.... -> ROLE_ADMIN(O), MANAGER(X)
/manager/main/... -> ROLE_MANAGER
/member
/** -> 권한 상관없이 모두 접근 가능


[SpEL 표현]
hasRole([role]) - 한명 권한을 가지고 있으면 true
hasAnyRole([role], [role2]) - 한명이라도 권한이 있으면 true
hasAuthority([authority]) -  한명 권한을 가지고 있으면 true
hasAnyAuthority([authority], [authority2]) - 한명이라도 권한이 있으면 true
principal - 접근을 허용
authentication - SecurityContext 인증허용되었으면 접근 허용
permitAll - 권한 상관없이 항상 true
denyAll - 항상 false
isAnonymous() - 권한이 익명이면 true
isRememberMe() - 기억된 사용자면 true
isAuthenticated() - 익명이 아니면 true
isFullyAuthenicated() - 기억된 사용자가 아니면 true

[role, auth 권한 표현식]
ROLE_ADMIN - 관리자
ROLE_USER - 일반사용자
ROLE_ANONYMOUS - 모든 사용자
ROLE_RESTRICTED - 제한(접근불가) 사용자
IS_AUTHENTICATED_FULLY - 인증된 사용자
IS_AUTHENTICATED_ANONYMOUS  - 익명 사용자
IS_AUTHENTICATED_REMEMBERED - 기억된 사용자

[사용자 권한 태그 유형] - 허가된 사용자의 아이디, 비밀번호 등 사용자 정보를 직접 설정
<authentication-manager> : 사용자 권한 인증을 위한 최상위 태그
<authentication-provider> : 사용자 정보를 인증 요청 처리할 때 사용
<user-service> : 사용자 정보 가져올 때 사용
<user> - name, pass, auth, 속성으로 정보를 출력

<beans:beans ...>
<authentication-manager>
	<authentication-provider>
		<user-service>
			<user name="admin" password="1234" authorities="ROLE_ADMIN, 										ROLE_USER">
			<user name="manager" password="1235"authorities="ROLE_MANAGER">
 			<user name="guest" password="1236"authorities="ROLE_USER">
		</user-service>
	</authentication-provider>
</authentication-manager>
</beans:beans ...>


[뷰 페이지에서 시큐리티 태그]
JSP 뷰 페이지에서 보안 / 특정 정보에 접근 -> 제약
-> 시큐리티 태그 라이브러리

[태그 선언]
<%@ taglib prefix="sec" 
	uri="http://www.springframework.org/
			security/tags" %>

pom.xml 등록하여 라이브러리 설치

- 권한 태그
<sec:authorize> : 태그 안에 있는 내용을 평가할지 결정
access : 접근 권한 설정을 위한 표현식
url : 접근 권한이 설정된 사용자만 허락하는 경로
var : 접근 권한이 설정된 사용자를 변수로 재정의

<sec:authorize acess="hasAnyRole('ROLE_ADMIN', 'ROLE_MANAGER')">
								  └>이 위치에 어떤 속성을 부여하냐에 따라 허용 범위 달라짐
								 



























*/
