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

<table border="1">
	<thead>
		<tr>
			<th>No.</th>
			<th>분류</th>
			<th>비밀번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>내용</th>
			<th>IP</th>
			<th>작성일</th>
			<th>삭제여부</th>
		</tr>
		<tr>
			<td>${freeBoard.boNo }</td>
			<td>${freeBoard.boCategory }</td>
			<td>${freeBoard.boPass }</td>
			<td>${freeBoard.boTitle }</td>
			<td>${freeBoard.boWriter }</td>
			<td>${freeBoard.boContent }</td>
			<td>${freeBoard.boIp }</td>
			<td>${freeBoard.boRegDate }</td>
			<td>${freeBoard.boDelYn }</td>
		</tr>
	</thead>
</table>
<a href="freeList.wow">목록</a>
<a href="freeEdit.wow?boNo=${freeBoard.boNo }">수정</a>

</body>
</html>