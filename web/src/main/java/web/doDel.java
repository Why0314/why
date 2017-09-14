package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserServiceImple;
import service.UserServiceInter;

@WebServlet("/doDel")
public class doDel extends HttpServlet{
	UserServiceInter ser= new UserServiceImple();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		ser.del(id);
		response.sendRedirect("doList");
	}
}
