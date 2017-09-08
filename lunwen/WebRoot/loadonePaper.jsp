<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="why.Paper"%>


<%

//1.连接到数据库 
Class.forName("com.mysql.jdbc.Driver");//注册驱动
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lunwen","root","root");//创建链接
Statement  sta=con.createStatement();

String stuXuehao=(String)request.getSession().getAttribute("stuXuehao");
ResultSet rrs=sta.executeQuery("select * from  student where stuXuehao="+stuXuehao);


if(rrs.next()){
	int aa=rrs.getInt(1);
	String ab=rrs.getString(2);
	String ac=rrs.getString(3);
	String ad=rrs.getString(4);
	String ae=rrs.getString(5);
	String af=rrs.getString(6);
	String ag=rrs.getString(7);
	String  ah=rrs.getString(8);
	
}

String bianhao=request.getParameter("bianhao");
ResultSet rs=sta.executeQuery("select * from  paper where bianhao="+rrs.getString(7));

if(rs.next()){
	int a=rs.getInt(1);
	String b=rs.getString(2);
	String c=rs.getString(3);
	String d=rs.getString(4);
	String e=rs.getString(5);
	String f=rs.getString(6);
	String g=rs.getString(7);
	String  h=rs.getString(8);
	String  i=rs.getString(9);
	//以上六个属性太零散，我们需要将这六个属性封装成一个java对象
	Paper  u=new Paper(a,b,c,d,e,f,g,h,i);
	request.setAttribute("why",u);//查询成功，将查询出来的这个用户的信息存储到request中，传到下一个页面显示
}


request.getRequestDispatcher("editPaper.jsp").forward(request,response);

%>