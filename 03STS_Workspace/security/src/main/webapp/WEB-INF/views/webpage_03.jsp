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
<sec:authorize access="hasRole('ROLE_ADMIN')" var="isAdmin">
	<p> <h3>관리자 권한 화면입니다.</h3>
</sec:authorize>

<c:choose> 
	<c:when test="${isAdmin}">
		<p> 로그인 중입니다.
		<p> 비밀번호 : <sec:authentication property="principal.password"/>
		<sec:authentication property="authorities" var="roles" scope="page"/>
		<p> 권한 : 
			<ul>
				<c:forEach var="role" items="${roles}">
					<li>${role}</li>
				</c:forEach>
			</ul>
		<p>사용자 : <sec:authentication property="principal.username"/>
		<p> <a href="<c:url value='/exam03' />"> /exam03 으로 이동 </a>
	</c:when>
	<c:otherwise>
		<p> 로그인 중이 아닙니다.		
		<p> <a href="<c:url value='/admin/tag'/>"> /admin/tag 로 이동하기 </a>
	</c:otherwise>
</c:choose>
</body>
</html>