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
	<div class="container-fluid my-3">
			
			<div class="row mb-4 border-bottom border-info">
				<h1 class="col-md-7 mx-auto text-center pb-3 fs-2">질문 등록</h1><br>
			</div>
			
			<div class="row col-md-8 mx-auto border-bottom ">
				<form action="./add" method="post">
				
					<div class="row mb-3">
					  <label for="exampleFormControlInput2" class="col-sm-1 col-form-label">작성자 </label>
					  <div class="col-sm-10">
					  	<input type="text" class="form-control" name="writer" id="exampleFormControlInput2" >
					  </div>
					</div>
				
					<div class="row mb-3">
					  <label for="exampleFormControlInput1" class="col-sm-1 col-form-label">제목</label>
					  <div class="col-sm-10">
					  	<input type="text" class="form-control" name="title" id="exampleFormControlInput1" placeholder="제목 입력">
					  </div>
					</div>
					

					
					<div class="row mb-3">
					  <label for="exampleFormControlInput3" class="col-sm-1 col-form-label">Image </label>
					  <div class="col-sm-10">
					  	<input type="file" class="form-control" name="pic" id="exampleFormControlInput3" placeholder="ex) 1.2 ...">
					  </div>
					</div>
					
					
	
					<div class="mb-5">
					  <label for="exampleFormControlTextarea1" class="form-label">글 내용</label>
					  <textarea class="form-control" name="comments" id="exampleFormControlTextarea1" rows="3"></textarea>
					</div>
					
					
					<div class="row mt-5 mb-3 col-md-1 offset-md-11">
						<button class="btn btn-primary " type="submit">작성하기</button>
					</div>
				
				</form>
			</div>
		</div>
	<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>