<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="why.Student"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
   <body>
<!--
<font size="+5" color="#00FFFF" face="华文行楷" >

这是我写的第一个网页，
这是内容文字。
</font>

<img src="top.jpg" width="1265" height="120" />

<img src="top.jpg" width="1265" height="120" />

首页   查阅    书架   还书     库存三
<div style="width:1400px;height:140px; background-image:url('top.JPG');padding-top:30px; background-position::center; background-repeat:no-repeat">
            这个font标签式是在网页里面修饰网站的头部字体的
            <font color="white"   style="font-size:80px; text-shadow:5px 5px 5px green" face="楷体">
                科信图书馆管理系统
             </font>
			 
-->


<div style="width:100%;height:140px; background-image:url('image/TOP1.png');
background-position:center; background-repeat:no-repeat">

<font style="font-size:80px; text-shadow:5px 5px 5px green;" color="#FFFFFF" face="楷体" >
毕业论文管理系统
</font>

</div>

<div style="width:100%; background-image:url('image/beijing4.jpg')">
	<center>
		
		
                <br/>
		<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
		 
		 <% Student u=(Student)request.getAttribute("why"); %>
		<form method="post"  action="updateStu.jsp">
				<input type="hidden"  name="stuBianhao" value="<%=u.getStuBianhao() %>" />
			<table border="1">
				<tr>
					<td>学号</td>
					<td><input type="text" name="stuXuehao" value="<%=u.getStuXuehao() %>"/></td>
				</tr>
				<tr>
					<td>学生姓名</td>
					<td><input type="text" name="stuName" value="<%=u.getStuName() %>"/></td>
				</tr>
				<tr>
					<td>密码</td>
					<td><input type="text" name="stuPassword" value="<%=u.getStuPassword() %>"/></td>
				</tr>
					<tr>
					<td>性别</td>
					<td>
					<%if(u.getStuXingbie().equals("男")) {%>
						<input type="radio"  style="width: 40px;" name="stuXingbie" value="男" checked="checked" />男
						<input type="radio"  style="width: 40px;"  name="stuXingbie" value="女" />女
					<%}else{ %>
						<input type="radio" style="width: 40px;"  name="stuXingbie" value="男" />男
						<input type="radio" style="width: 40px;"  name="stuXingbie" value="女"  checked="checked" />女
					<%} %>
					</td>
				</tr>
				<tr>
					<td>专业</td>
					<td><input type="text" name="stuZhuanye" value="<%=u.getStuZhuanye() %>"/></td>
				</tr>
		<tr>
					<td>论文</td>
					<td><input type="text" name="stuLunwen" value="<%=u.getStuLunwen() %>"/></td>
				</tr>
				<tr>
					<td>导师</td>
					<td><input type="text" name="stuDaoshi" value="<%=u.getStuDaoshi() %>"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit"  value="确认修改"/><input type="reset"  value="返回"  onclick="history.go(-1);"/>
					</td>
				</tr>
			</table>
		</form>
		 </center>
		 <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
		 
		</div>
     
				

	


<div style="width:100%; height:60px; background-image:url('image/hei.JPG')">
<br />
<center>
	
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    
		<a style="text-decoration:none; font-size:12px; color:#FFFFFF;	href="">友情链接</a>
		<a style="text-decoration:none; font-size:12px; color:#FFFFFF;	 href="">关于我们</a>
		<a style="text-decoration:none; font-size:12px; color:#FFFFFF;	href="">联系我们</a>
		<br/>
		
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
		<font   face="华文行锴" size="2"color="white"><i>@河北工程大学</i></font>
	</center>
</div>

</body>
</html>