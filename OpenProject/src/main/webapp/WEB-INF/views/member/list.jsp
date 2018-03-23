<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
div {
	width: 200px;
	height: 200px;
	background-image: url('../uploadfile/memberphoto/${mem.photo}');
	background-size: 100%;
}
</style>
</head>
<body>

	<h1>리스트 페이지</h1>
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>가입날짜</th>
			<th>사진</th>
			<th>관리</th>
		
		<c:forEach items="${mList }" var="mem">
		<tr>
		<td>${mem.member_id }</td>
		<td>${mem.member_name }</td>
		<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm"
										value="${mem.regdate}" /></td>

		<td><input type="image" width="100px" height="100px" src="../uploadfile/memberphoto/${mem.photo}"></td>
		<td><a href="read?member_id=${mem.member_id }">보기</a>&nbsp&nbsp<a href="modify?member_id=${mem.member_id }">수정</a>&nbsp&nbsp<a href="remove?member_id=${mem.member_id }">삭제</a></td>
		</c:forEach>
	</table>
</body>
</html>