<%
	if(request.getSession().getAttribute("stuXuehao")==null){
	response.sendRedirect("indexStu.jsp");
	}
 %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page  import="why.Paper"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
   <body>
    <script type="text/javascript">
		 function search()
			 {
				window.location.href='papercl.jsp?key='+document.getElementById('key').value;
			 }
		 </script>
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
					<a style="text-decoration:none; font-size:23px; font-weight:bold" href="paperXtcl.jsp">论文选题</a>  
				</td>
				<td>
					<a style="text-decoration:none; font-size:23px; 	" href="loadonePaper.jsp">上传论文</a>  
				</td>
			
			</tr>
		</table>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;        
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   
<input type="text"     id="key"        value="${requestScope.key }"/>
		<input type="button"  value="搜索"  style="width: 40px;"  onclick="search()"/>	
		<table width="80%" border="1">
        <tr>
       
		  
          <th scope="col">序号</th>
          <th scope="col">类型</th>
          <th scope="col">题目</th>       
          <th scope="col">导师</th>  
          <th scope="col">操作</th>

        </tr>
         <%
						//先取上一个页面在request里面存的集合，然后循环输出集合里面存的数据信息
						ArrayList<Paper> us=(ArrayList<Paper>)request.getAttribute("why");//从request里面取出的数据默认是Object类型，所以要强制转化成之前存储的集合类型
						for(int n=0;n<us.size();n++){
							Paper u=us.get(n);//循环里面使用n当做下表来取集合对应位置上的对象
						
						%>
						
						<%if(request.getAttribute("updateId")!=null&&u.getBianhao()==Integer.parseInt(request.getAttribute("updateId").toString())){ %>
	                   <tr id="updateRow" style="background-color: green;"  onmouseover="this.style.backgroundColor='#eeeeee'"  onmouseout="this.style.backgroundColor=''">
	                   <%}else{ %>
	                   <tr  style="background-color: white;"  onmouseover="this.style.backgroundColor='#eeeeee'"  onmouseout="this.style.backgroundColor=''">
	                   <%} %>
        <tr  onmouseover="this.style.backgroundColor='#eeeeee'"  onmouseout="this.style.backgroundColor=''">
        <td><%=u.getBianhao() %></td>
        <td><%=u.getLeixin() %></td>
        <td><%=u.getTimu() %></td>
        <td><%=u.getDaoshi() %></td>
         <td>
         <a href="paperXtht.jsp?bianhao=<%=u.getBianhao() %>">选择</a>
         </td>
          </tr>
          
          <%
          //request.getSession().setAttribute("daoshi",u.getDaoshi());
          } %>
        
                </table> 
                    
                 <script type="text/javascript">
                 function deletepaper(bianhao){
	                 if(window.confirm('确认删除吗')){
	                 	window.location.href="deletepaper.jsp?bianhao="+bianhao;
	                 }
                 }
                 </script>
				
	</center>
	
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