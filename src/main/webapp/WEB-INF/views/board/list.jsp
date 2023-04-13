<%@ page pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시글 목록</title>
<script type="text/javascript" src="/resources/js/jquery-1.3.2.min.js"></script>
<script>
    $(document).ready(function(){
        $("#btnWrite").click(function(){
            // 페이지 주소 변경(이동)
            location.href = "/board/write";
        });
    });
</script>
</head>
<body>
<h2>게시글 목록</h2>
<button type="button" id="btnWrite">글쓰기</button>
<table border="1" width="600px">
    <tr>
        <th>번호</th>
        <th>제목</th>
        <th>이름</th>
        <th>작성일</th>
        <th>조회수</th>
    </tr>
    <c:forEach var="row" items="${list}">
    <tr>
        <td>${row.bno}</td>
        <td><a href="/board/view?bno=${row.bno}">${row.title}</a></td>
        <td>${row.writer}</td>
        <td>
        ${row.modifier_Date}
            <!-- 원하는 날짜형식으로 출력하기 위해 fmt태그 사용 -->
<%--             <fmt:formatDate value="${row.modifier_Date}" pattern="yyyy-MM-dd HH:mm:ss"/> --%>
        </td>
        <td>${row.viewcnt}</td>
    </tr>    
    </c:forEach>
</table>
</body>
</html>