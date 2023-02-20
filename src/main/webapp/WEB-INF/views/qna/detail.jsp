<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/common_css.jsp"></c:import>
</head>
<body>
<div class="container-fluid my-5">
	<c:choose>
		<c:when test="${not empty dto}">
			<h3>글 번호 : ${dto.qnaNum}</h3>
			<h3>글 제목 : ${dto.qnaTitle}</h3>
			<h3>글 내용 : ${dto.qnaDetail}</h3>
			<h3>작성자 : ${dto.qnaWriter}</h3>
			<h3>작성날짜 : ${dto.qnaDate}</h3>
			<h3>조회수 : ${dto.qnaHit}</h3>
		</c:when>
		
		<c:otherwise>
			<h3>존재하지 않는 게시물입니다</h3>
		</c:otherwise>
	</c:choose>
	
	
			<a href="./list" class="btn btn-primary">목록으로</a>
			<a href="./update?qnaNum=${dto.qnaNum}&qnaHit=${dto.qnaHit}" class="btn btn-primary">글 수정</a>
			<a href="./delete?qnaNum=${dto.qnaNum}" class="btn btn-primary">글 삭제</a>
			
			

</div>
	<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>