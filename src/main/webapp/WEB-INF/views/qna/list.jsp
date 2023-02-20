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

	<div class="row mb-4">
		<h1 class="col-md-7 mx-auto text-center border-bottom border-dark pb-4">QnA List Page</h1>
	</div>	

	<div class="row col-md-7 mx-auto">			
			<table class="table table-hover table-striped">
				<thead>
					<tr>
						<th>글번호</th>
						<th>제목</th>
						<th>작성자</th>
						<th>작성날짜</th>
						<th>조회수</th>
					</tr>
				</thead>
				
				<tbody class="table-group-divider">
					<c:forEach items="${list}" var="dto">
					
						<tr>
								<td>${dto.qnaNum}</td>
								<td><a href="./detail?qnaNum=${dto.qnaNum}&qnaHit=${dto.qnaHit}">${dto.qnaTitle}</a></td>
								<td>${dto.qnaWriter}</td>
								<td>${dto.qnaDate}</td>
								<td>${dto.qnaHit}</td>
						</tr>
					</c:forEach>
				</tbody>	
			</table>
			
			<div class="row col-md-3 offset-md-9">
				<a href="./add" class="btn btn-primary">상품 등록</a>
			</div>	
		</div>

	</div>
	<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>