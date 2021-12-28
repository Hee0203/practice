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

<form action="freeRegist.wow" method="POST">
<table border="1">
	<tr>
		<th>제목</th>
		<td><input type="text" name="boTitle" value=""></td>
	</tr>
	<tr>
		<th>작성자</th>
		<td><input type="text" name="boWriter" value=""></td>
	</tr>
	<tr>
		<th>비밀번호</th>
		<td><input type="text" name="boPass" value=""></td>
	</tr>
	<tr>
		<th>분류</th>
		<td>
			<select name="boCategory">
				<option value="">--선택--</option>
				<option value="BC01">프로그램</option>
				<option value="BC02">웹</option>
				<option value="BC03">사는 이야기</option>
				<option value="BC04">취업</option>
			</select>
		</td>
	</tr>
	<tr>
		<th>IP</th>
		<td><%=request.getRemoteAddr() %><input type="text" name="boIp" value="<%=request.getRemoteAddr()%>"></td>
	</tr>
	<tr>
		<th>내용</th>
		<td><input type="text" name="boContent" value=""></td>
	</tr>
</table>
<a href="freeList.wow">목록</a>
<button type="submit">저장</button>
</form>

</body>
</html>