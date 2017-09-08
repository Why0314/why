 <%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="why.Paper"%>
<%@page import="why.Student"%>


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
//2.查询数据库里面的所有书籍信息 
ResultSet rs=sta.executeQuery("select *  from paper where bianhao="+rrs.getString(7));




ArrayList<Paper> why=new ArrayList<Paper>();//定义一个java中的集合(装东西的一个容器)
while(rs.next()){
	int a=rs.getInt(1);
	String b=rs.getString(2);
	String c=rs.getString(3);
	String d=rs.getString(4);
	String e=rs.getString(5);
	String f=rs.getString(6);
	String g=rs.getString(7);
	String  h=rs.getString(8);
	String  i=rs.getString(9);
	
	Paper u=new Paper(a,b,c,d,e,f,g,h,i);//将刚才读取到的一本书的几个数据封装到一个java对象中
	why.add(u);//因为数据要传到下一个界面，所以定义了一个集合，讲每次读取到的一条数据存储到集合中
} 

rs.close();
sta.close();
con.close();

request.setAttribute("why",why);




//3.跳转到书籍管理界面，讲所有查询到都是书籍信息显示出来供用户来管理操作

request.getRequestDispatcher("editPaper.jsp").forward(request,response);


%>
