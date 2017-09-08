<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%
request.setCharacterEncoding("UTF-8");
//1.把用户修改之后的信息取出来，然后再使用数据库操作修改到数据库
String bianhao=request.getParameter("bianhao");
String timu=request.getParameter("timu");
String leixing=request.getParameter("leixing");
String jianjie=request.getParameter("jianjie");
String shijian=request.getParameter("shijian");
String neirong=request.getParameter("neirong");


         
//1.连接到数据库 
Class.forName("com.mysql.jdbc.Driver");//注册驱动
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lunwen","root","root");//创建链接
Statement  sta=con.createStatement();

//2.执行修改的sql语句
int count=sta.executeUpdate("update paper set bianhao='"+bianhao+"',timu='"+timu+"',leixin='"+leixing+"',jianjie='"+jianjie+"',fabushijian='"+shijian+"',neirong='"+neirong+"' where bianhao="+bianhao);
sta.close();
con.close();
if(count>0)
{
	request.setAttribute("updateMessage","修改成功!");

}else
{
	request.setAttribute("updateMessage","修改失败!");
}
request.setAttribute("updateId",bianhao);

request.getRequestDispatcher("xueshengcl.jsp").forward(request,response);

%>
