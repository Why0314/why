<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<style type="text/css">

</style>
</head>
<body>
	<form action="doUpdate" method="post">
		<input type="hidden" name="id" value="${user.id }">
		用户名：<input type="text" name="loginId" value="${user.loginId }"><br>
		密&nbsp码：<input type="text" name="password" value="${user.password }"><br>
		<input type="submit" value="提交">
	</form>
</body>
</html>