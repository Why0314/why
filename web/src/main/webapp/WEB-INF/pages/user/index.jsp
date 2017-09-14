<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<style type="text/css">
	#tb{
		border-collapse: collapse;
	}
	#tb th,#tb td{
		border:1px solid #aaa;
		padding:5px 15px;
	}
</style>
</head>
	<body>
		<table id="tb">
			<thead id="th">
			  <tr>
				<th>ID</th>
			    <th>用户名</th>
			    <th>密码</th>
			    <th>操作</th>
			  </tr>
			 </thead>
			<tbody id="td">
			  
			  <c:forEach items="${users }" var="u">
				  <tr>
				  	<td>${u.id }</td>
				    <td>${u.loginId }</td>
				    <td>${u.password }</td>
				    <td><a href="toUpdate?id=${u.id }">修改</a><a href="doDel?id=${u.id }">删除</a></td>
				  </tr>
			  </c:forEach>			    
			 
			 </tbody> 
		</table>
		<a href="toAdd">增加一条记录</a><br>
		${basePath }
		
	</body>
</html>