<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Security</title>
</head>
<body>
<h2>스프링 시큐리티 태그 예시</h2>
<sec:authorize access="isAuthenticated()">
    <h5><sec:authentication property="principal.username"/>님, 반갑습니다.</h5>
    <form action="./logout" method="POST">
    <button type="submit">LOGOUT</button>
        <input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}"/>
    </form>
</sec:authorize>
</body>
</html>