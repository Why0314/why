<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>

<!-- 如果一个jsp是完成后台代码的组件，那么请将该jsp上的所有html代码删除 --> 

<%
//这里应该书写判断登陆的代码，如果成功跳转到主页，如果不成功跳转到登陆页面

//处理登陆的代码步骤

//1.获取上一个页面上表单里面的数据
String zhanghao=request.getParameter("zhanghao");//用request对象获取上一个页面的参数
String mima=request.getParameter("mima");


//2.获取用户名和密码成功之后，连接数据库查询这个用户名和密码的用户存不存在 
Class.forName("com.mysql.jdbc.Driver");//注册驱动
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lunwen","root","root");//创建链接
Statement  sta=con.createStatement();


ResultSet  rs=sta.executeQuery("select * from  user where zhanghao='"+zhanghao+"' and mima='"+mima+"'");

//3.根据查询的结果，如果存在，则跳转到首页 ，不存在跳回到登陆页面

if(rs.next()){
	request.getSession().setAttribute("zhanghao",zhanghao);
	response.sendRedirect("daoshicl.jsp");
}else
{
	request.getRequestDispatcher("index.jsp").forward(request,response);
}

rs.close();
sta.close();
con.close();
 %>

 