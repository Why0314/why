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
	<form action="doLogin" method="post">
	用户名：<input type="text" name="user" ><br>
	密    码：<input type="password" name="password">
	<input type="submit" value="登录"><br>
	<div>${message }</div>
	
	</form>
</body>
</html>