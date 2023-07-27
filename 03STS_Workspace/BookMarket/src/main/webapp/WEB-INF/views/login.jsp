<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  
<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<nav class="navbar navbar-expand navbar-dark bg-dark">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="./home">Home</a>
				<a class="navbar-brand" href="./webtoons">도서목록</a>
				<a class="navbar-brand" href="./home">게시판</a>
			</div>
		</div>
	</nav>

	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">로그인</h1>
			<!-- 
			<h2>${pageContext.request.contextPath}</h2>
			 -->
		</div>
	</div>
	
	<div class = "container col-md-4">
			
		<div class="text-center">
			<h3 class="form-signin-heading">Please Login</h3>
		</div>
	
		<c:if test="${not empty error}">
			<div class="alert alert-danger">
				Username 또는 Password 가 올바르지 않습니다.
			</div>
		</c:if>

		<form class="form-signin" action="<c:url value="/login"/>" method="post">
			<div class="form-group row">
				<input type="text" name="username" class="form-control"
					placeholder="User Name" required autofocus> 
			</div>
			
			<div class="form-group row">
				<input type="password" name="password" class="form-control"
				placeholder="Password" required>
			</div>
			
			<div class="form-group row">
				<button class="btn btn-lg btn-success btn-block" 
				type="submit">로그인</button>
				<input type="hidden" name="${_csrf.parameterName }"
					value="${_csrf.token }"/>
			</div>
		</form>
		
	</div>
	
	
	
	
	
	
	
	

</body>
</html>