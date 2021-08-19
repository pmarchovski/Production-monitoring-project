package com.mdrain.servlets;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mdrain.database.Database;

public class HomeServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 
		String password = req.getParameter("user_password");
		String userName = req.getParameter("user_name");		
		
		HttpSession session = req.getSession();
		
		session.setAttribute("user_name", userName);
		session.setAttribute("user_password", password);
			
		resp.sendRedirect("shop");

	}
}
