<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My Page</title>
<style>
div {
	width: 200px;
	height: 200px;
	background-image: url('../../uploadfile/memberphoto/${member.photo}');
	background-size: 100%;
}
</style>
</head>
<body>
	<div id="my"></div>
	${member.member_id} / ${member.member_name} /${member.photo }
</body>
</html>