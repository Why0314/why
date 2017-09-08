<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="why.User"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
  <title>Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- font files  -->
<link href='http://fonts.useso.com/css?family=Muli:400,300' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Nunito:400,300,700' rel='stylesheet' type='text/css'>
<!-- /font files  -->
<!-- css files -->
<link href="css/style.css" rel='stylesheet' type='text/css' media="all" />
<!-- /css files -->
</head>
<body>
<h1>毕业论文管理</h1><center>
<div class="log">
	<div class="content1">
		
		<h2>首页入口</h2>
		
		  
		    <form action="index.jsp">
		    <div class="button-row">
			<input type="submit" class="sign-in"   value="管理员入口">
			</form>	
			
	      <form action="indexStu.jsp">
			<div class="button-row">
			<input type="submit" class="sign-in"   value="学生入口">
			</form>	
			
			
			<br></br>
			
			<form action="indexPs.jsp">
			<div class="button-row">
			<input type="submit" class="sign-in" value="评审入口">
		
			
			
			</div>
		
	</div>	
</div>
</center>
</body>
</html>