<%@ page pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html>  
<head>  
<title>로그인</title>  
<script type="text/javascript" src="/resources/js/jquery-1.3.2.min.js"></script>
<script>
$(document).ready(function () {
	
	$("#loginBtn").click(function(e){
		e.preventDefault(); // 기본 제출 동작을 막습니다.
		//var formData = ("#loginForm").serialize(); 
		var id = $("input[name='userid']").attr("value"); 
		var password=  $("input[name='userpassword']").attr("value"); 
			
	    $.ajax({
	        type: "POST",
	        url: "/auth/login",
	        data: {"userid":id,"password":password},
	        success: function(data) {
	        	window.location.href="/"; 
	        },
	        error: function(xhr, status, error) {
	          // 처리 중 에러가 발생한 경우 처리할 코드를 작성합니다.
	          alert("로그인 실패: " + error);
	        }
	      });
		
	});
	
});


</script>
</head>  
<body>  

<form id="loginForm" method="POST">
	아이디 : <input type="text" name="userid" value="" />
	비밀번호 : <input type="password" name="userpassword" value="" />
</form>
<button id="loginBtn">로그인</button>
</body>  
</html>  