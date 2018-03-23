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
<form action="modify" method="post" enctype="multipart/form-data">
<table>
	<tr>
		<td>아이디(이메일)</td>
		<td><input type="text" name="member_id" value="${member.member_id }"readonly="readonly">  </td>
	</tr>  
	<tr>
		<td>이름</td>
		<td><input type="text" name="member_name" value="${member.member_name }" >  </td>
	</tr> 
	<tr>
		<td>사진</td>
		<td><input type="file" name="photofile">  </td>
	</tr> 
	<tr>
		<td></td>
		<td>
			<input type="submit" value="수정">
		</td>
	</tr>
</table>

</form>
	<a href="list">리스트로</a>
</body>
</html>