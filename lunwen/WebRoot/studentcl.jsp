 <%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="why.Student"%>



<%

//1.连接到数据库 
Class.forName("com.mysql.jdbc.Driver");//注册驱动
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lunwen","root","root");//创建链接
Statement  sta=con.createStatement();


//2.查询数据库里面的所有书籍信息 

ResultSet  rs=null;
if(request.getParameter("key")!=null)
{
	rs=sta.executeQuery("select *  from student  where stuBianhao like '%"+request.getParameter("key")+"%'");
	request.setAttribute("key",request.getParameter("key"));
}else 
{
  rs=sta.executeQuery("select *  from student");
}
ArrayList<Student> why=new ArrayList<Student>();//定义一个java中的集合(装东西的一个容器)
while(rs.next()){
	int  bh=rs.getInt(1); 
	String xuehao=rs.getString(2);
	String name=rs.getString(3);
	String xingbie=rs.getString(4);
	String zhuanye=rs.getString(5);
	String pw=rs.getString(6);
	String lw=rs.getString(7);
	String ds=rs.getString(8);
	
	Student u=new Student(bh,xuehao,name,xingbie,zhuanye,pw,lw,ds);//将刚才读取到的一本书的几个数据封装到一个java对象中
	why.add(u);//因为数据要传到下一个界面，所以定义了一个集合，讲每次读取到的一条数据存储到集合中
} 

rs.close();
sta.close();
con.close();

request.setAttribute("why",why);




//3.跳转到书籍管理界面，讲所有查询到都是书籍信息显示出来供用户来管理操作

request.getRequestDispatcher("student.jsp").forward(request,response);


%>
