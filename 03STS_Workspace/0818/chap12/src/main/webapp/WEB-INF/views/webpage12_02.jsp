<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
<title>Internationalization</title>
</head>
<body>
	<h2>다국어 처리</h2>
   <p><a href="?language=ko_KR" >Korean</a>|<a href="?language=en_US">Engish</a>
  <p><spring:message code="Person.form.Enter.message"/>
</body>
</html>