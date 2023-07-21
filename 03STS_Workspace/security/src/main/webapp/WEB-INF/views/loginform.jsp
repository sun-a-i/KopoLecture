<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Security</title>
</head>
<body>

<h2>스프링 시큐리티 </h2>

<form action="./login"	method="post">
	<p>사용자명 <input type="text" name="username" placeholder="username" >
	<p>비밀번호 <input type="password" name="password" 	placeholder="password" >
	<p><button type="submit">로그인</button>				
	<input type="hidden" name="${_csrf.parameterName}" 	value="${_csrf.token}" />
</form>	

</body>
</html>