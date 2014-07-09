<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post">
		<input value="${user.name}" name="user.name">
		<input value="${user.password}" name="user.password" type="password">
		<input type="submit">
	</form>
</body>
</html>