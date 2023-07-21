<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<link href="./resources/css/bootstrap.min.css" rel="stylesheet">
<meta charset="EUC-KR">
<title>Welcome</title>
</head>
<body>
	<nav class="navbar navbar-expand navbar-dark bg-dark">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="./home">Home</a>
				<a class="navbar-brand" href="./webtoons">웹툰목록</a>
				<a class="navbar-brand" href="./home">게시판</a>
			</div>
		</div>
	</nav>

	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">웹툰 목록</h1>
		</div>
	</div>

	<div class="container">
		<div class="row" align="center">
			
			<c:forEach items="${webtoonList }" var="webtoon">
				<div class="col-md-4">
					<p> <img src=./resources/img/${webtoon.imgPath }></p> 
					<h3>${webtoon.name}</h3>
					<p>${webtoon.author }
						<br>${webtoon.genre} | ${webtoon.releaseDay }
					<p align=left>${fn:substring(webtoon.description, 0, 50)}...
					<p>${webtoon.ranking}
				</div>
			</c:forEach>
		</div>
	</div>

	<footer class="container">
		<hr>
		<p>&copy; Webtoon</p>
	</footer>
</body>
</html>