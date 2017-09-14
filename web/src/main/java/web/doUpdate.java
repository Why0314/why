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

@WebServlet("/doUpdate")
public class doUpdate extends HttpServlet{
	UserServiceInter ser  = new UserServiceImple();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id =Integer.parseInt(request.getParameter("id"));
		String loginId =  request.getParameter("loginId");
		String password = request.getParameter("password");
		User u = new User();
		u.setId(id);
		u.setLoginId(loginId);
		u.setPassword(password);
		ser.edit(u);
		response.sendRedirect("doList");
	}

}
