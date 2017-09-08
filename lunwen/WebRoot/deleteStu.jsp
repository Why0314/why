
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>


<%

//1.连接到数据库 
Class.forName("com.mysql.jdbc.Driver");//注册驱动
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lunwen","root","root");//创建链接
Statement  sta=con.createStatement();

String bianhao=request.getParameter("bianhao");//取上一个页面传过来的参数,request.getParameter
int n=sta.executeUpdate("delete from  student  where stuBianhao="+bianhao);
//当数据库操作完毕之后应该关闭资源
sta.close();
con.close();
if(n>0)
{
	request.setAttribute("deleteMessage","删除成功!");

}else
{
	request.setAttribute("deleteMessage","删除失败!");
}

request.getRequestDispatcher("studentcl.jsp").forward(request,response);

%>