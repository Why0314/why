package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojo.User;
import service.UserServiceImple;
import service.UserServiceInter;
@WebServlet("/doList")
public class UserListServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserServiceInter service = new UserServiceImple();
		List<User> users = service.getUsers();
		request.setAttribute("users", users);
		request.getRequestDispatcher("WEB-INF/pages/user/index.jsp").forward(request, response);
	}
}
