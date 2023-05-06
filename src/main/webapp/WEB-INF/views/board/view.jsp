<%@ page pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시글 상세보기</title>
<script type="text/javascript" src="/resources/js/jquery-1.3.2.min.js"></script>
<script>
$(document).ready(function () {
	
	$("#listBtn").click(function(){
		window.location.href="./list"; 
	});
	
});


</script>
</head>
<body>
<h2>게시글 상세보기</h2>
	<table border="1px">
		<tr>
			<td>제목 : </td>
			<td>${data.title}</td>
		</tr>
		<tr>
			<td>내용 : </td>
			<td><textarea>${data.content}</textarea></td>
		</tr>
		<tr>
			<td colspan="2">작성자 : ${data.writer}</td>
		</tr>
		<tr>
			<td colspan="2">작성일자 : <fmt:formatDate value="${data.modifier_Date}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
		</tr>
	</table>
	<button id="listBtn">목록으로</button>
</body>
</html>