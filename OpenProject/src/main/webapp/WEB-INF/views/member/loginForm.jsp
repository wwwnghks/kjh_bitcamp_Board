<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인 폼</title>
<style>

</style>
</head>
<body>
<h1>로그인 폼</h1>
<form action="login.do" method="post">
<table>
	<tr>
		<td>아이디(이메일)</td>
		<td><input type="text" name="member_id"> </td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type="password" name="password"> </td>
	</tr>
	<tr>
		<td></td>
		<td><input type="submit" value="로그인"> <input type="reset"> </td>
	</tr>
</table>
</form>















</body>
</html>