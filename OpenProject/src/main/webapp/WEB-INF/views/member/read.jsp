<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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

		<tr>
		<td>${member.member_id }</td>
		<td>${member.member_name }</td>
		<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm"
										value="${member.regdate}" /></td>
		<td><input type="image" width="100px" height="100px" src="../uploadfile/memberphoto/${member.photo}"></td>
	</table>
	<a href="list">리스트로</a>
</body>
</html>