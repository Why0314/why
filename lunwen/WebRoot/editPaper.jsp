<%
	if(request.getSession().getAttribute("stuXuehao")==null){
	response.sendRedirect("indexStu.jsp");
	}
 %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="why.Student"%>
<%@page import="why.Paper"%>
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
		<table  width="100%">
			<tr>
			<td>
					<a style="text-decoration:none; font-size:23px; 	" href="why.jsp">首页</a>  
				</td>
				<td>
			<% if (request.getSession().getAttribute("stuXuehao")==null){ %>
					<a style="text-decoration:none; font-size:23px; 	" href="index.jsp">登陆</a>  
				
					<%}else{ %>
						欢迎您：<%=request.getSession().getAttribute("stuXuehao") %>!
							<a style="text-decoration:none; font-size:10px; coloc:blue	" href="indexStu.jsp">注销</a>
					<!-- <a style="text-decoration:none; font-size:10px; 	" href="gaimi.jsp">修改密码</a> -->		
						<%} %>
						<td>
				<a style="text-decoration:none; font-size:23px; " href="xueshengcl.jsp">个人信息</a> 
				</td> 
			<td>
					<a style="text-decoration:none; font-size:23px; 	" href="paperXtcl.jsp">论文选题</a>  
				</td>
				<td>
					<a style="text-decoration:none; font-size:23px; 	font-weight:bold" href="loadonePaper.jsp">上传论文</a>  
				</td>
		</table>
		
                <br/>
		<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
		 
		 <% Paper u=(Paper)request.getAttribute("why"); %>
		<form method="post"  action="updatePaper.jsp">
				<input type="hidden"  name="bianhao" value="<%=u.getBianhao() %>" />
			<table border="1">
				<tr>
					<td>题目</td>
					<td><input type="text" disabled="true" name="timu" value="<%=u.getTimu() %>"/></td>
				</tr>
				<tr>
					<td>类型</td>
					<td><input type="text" disabled="true" name="leixing" value="<%=u.getLeixin() %>"/></td>
				</tr>
				<tr>
					<td>简介</td>
					<td><input type="text"   name="jianjie" value="<%=u.getJianjie() %>"/></td>
				</tr>
			<tr>
					<td>时间</td>
					<td><input type="text"  name="shijian" value="<%=u.getShijian() %>"/></td>
				</tr>
				<tr>
					<td>内容</td>
					<td><input type="text" name="neirong" value="<%=u.getNeirong() %>"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit"  value="确认上传"/><input type="reset"  value="返回"  onclick="history.go(-1);"/>
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