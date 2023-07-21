<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
<meta charset="EUC-KR">
<title>BooksMarket</title>
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
			<h1 class="display-3">도서 목록</h1>
			<!-- 
			<h2>${pageContext.request.contextPath}</h2>
			 -->
		</div>
	</div>

	<div class="container">
		<div class="row" align="center">
			<c:forEach items="${bookList }" var="book">
				<div class="col-md-4">
					<h3>${book.name}</h3>
					<p>${book.author }
						<br>${book.publisher} | ${book.unitPrice}원
					<p align=left>${fn:substring(book.description, 0, 50)}...
					<p>${book.releaseDate}
					
					<p><a href="<c:url value="/books/book?id=${book.bookId}"/>" class="btn btn-secondary" role="button">상세보기 &raquo;</a>
					
				</div>
			</c:forEach>
		</div>
	</div>

	<footer class="container">
		<hr>
		<p>&copy; BOOK</p>
	</footer>
</body>
</html>