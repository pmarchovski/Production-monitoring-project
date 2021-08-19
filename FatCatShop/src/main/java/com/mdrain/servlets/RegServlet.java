package com.mdrain.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mdrain.database.Database;
import com.mdrain.logic.Users;

public class RegServlet extends HttpServlet{
	
Database db = Database.getInstance();
Users users = new Users();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		users.setFullName(req.getParameter("full_name"));
		users.setUserName(req.getParameter("user_name")); 
		users.setEmail(req.getParameter("email"));
		users.setPassword(req.getParameter("password"));
		HttpSession session = req.getSession();
		
		if((users.getFullName().equals("")) || (users.getUserName().equals("")) || (users.getEmail().equals("")) || (users.getPassword().equals(""))) {
			resp.sendRedirect("error.jsp");
			session.setAttribute("massage", "Съществува потребител с този e-mail");
		} else {
			db.insertUsers(users.getFullName(), users.getUserName(), users.getEmail(), users.getPassword());
		    db.delete();
		resp.sendRedirect("index.jsp");
		session.setAttribute("massage", "Успешна регистрация");
		}
	}
}
