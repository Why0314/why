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

@WebServlet("/toUpdate")
public class toUpdate extends HttpServlet{
	
	UserServiceInter service = new UserServiceImple();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		User u = service.getUserById(id);
		request.setAttribute("user", u);
		request.getRequestDispatcher("WEB-INF/pages/user/update.jsp").forward(request, response);
	}
}
