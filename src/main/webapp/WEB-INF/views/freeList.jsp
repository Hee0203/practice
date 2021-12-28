<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%request.setCharacterEncoding("UTF-8"); %>
</head>
<body>

<a href="freeForm.wow">등록</a>
<table border="1">
	<thead>
		<tr>
			<th>No.</th>
			<th>분류</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		
		<c:forEach items="${freeBoardList }" var="freeBoard">
			<tr>
				<td>${freeBoard.boNo }</td>
				<td>${freeBoard.boCategory }</td>
				<td><a href="freeView.wow?boNo=${freeBoard.boNo }">${freeBoard.boTitle }</a></td>
				<td>${freeBoard.boWriter }</td>
				<td>${freeBoard.boRegDate }</td>
				<td>${freeBoard.boHit }</td>
			</tr>
		</c:forEach>
	</thead>

</table>

</body>
</html>