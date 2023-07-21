<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Security</title>
</head>
<body>
<h3>접근 권한과 사용자 권한 설정</h3>
<p>해당 뷰 페이지는 ${data} 입니다.
<p><a href="<c:url value='/exam01'/>">
	[웹요청 URL : /exam01 로 이동]</a>
</body>
</html>