<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>파일 업로드</h3>
	<form:form action="form" modelAttribute="member"  method="post" enctype="multipart/form-data">
		<p>이름 : <form:input path="name"/>
		<p>파일 : <form:input path="imageFile" type="file"/>
		<p><input type="submit" value="전송" /> <input type="reset" value="다시쓰기" />
	</form:form>
</body>
</html>