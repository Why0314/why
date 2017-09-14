package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojo.User;
import service.UserServiceImple;
import service.UserServiceInter;

@WebServlet("/doLogin")
public class doLogin extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserServiceInter service = new UserServiceImple();
		//接收参数
		String loginId = request.getParameter("user");
		String password = request.getParameter("password");
		System.out.println(loginId+"----"+password);
		// 通过输入的用户名 查询用户信息是否存在
		User u = service.getUserByLoginId(loginId);
		//判断u是否为null 如果为null 说明用户名输入错误
		if(u==null){			
			request.setAttribute("message", "用户名错误！");
			//跳转回登录页 由于携带信息 所以要用转发
			request.getRequestDispatcher("WEB-INF/pages/user/login.jsp").forward(request, response);
		}else{	
			if(u.getPassword().equals(password)){
				System.out.println("2");
				//request.getSession().setAttribute("user", u);
				response.sendRedirect("doList");				
			}else{
				System.out.println("3");
				request.setAttribute("message", "密码错误！");
				request.getRequestDispatcher("WEB-INF/pages/user/login.jsp").forward(request, response);
			}
		}
	}
}
