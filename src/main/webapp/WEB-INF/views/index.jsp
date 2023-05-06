<%@ page pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html>  
<head>  
<title>시작 페이지</title>  
</head>  
<body>   
<h1>시작 페이지</h1>  

	<c:if test="${userid!=null}">
		<p>${userid} : 님 안녕하세요</p>
	</c:if>
	<c:if test="${userid==null}">
		<a href="./auth/login">로그인</a>
	</c:if>
	<br>
<c:if test="${userid!=null}">
<a href="/book/create">책 생성하기</a></br>
</c:if>
<a href="/book/list">책 리스트</a></br>
<c:if test="${userid!=null}">
<a href="/board/write">게시판 글 작성</a></br>
</c:if>
<a href="/board/list">게시판 글 리스트</a></br>
</body>  
</html>  