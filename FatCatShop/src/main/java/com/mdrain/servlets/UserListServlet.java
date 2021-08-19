package com.mdrain.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.mdrain.database.Database;
import com.mdrain.logic.Users;

public class UserListServlet extends HttpServlet{
	
	Users users = new Users();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

	
		Database db = Database.getInstance();

		ResultSet list = db.select("users");
	
		ArrayList<Users> collection = new ArrayList<>();
			
		HttpSession session = req.getSession();
		
		try {
			while (list.next()) {
	
			Users users = new Users();
			
			users.setFullName(list.getString("full_name"));	
			users.setUserName(list.getString("user_name"));	
			users.setEmail(list.getString("email"));
			users.setPassword(list.getString("password"));

		 	
		    collection.add(users);		

			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		session.setAttribute("collection", collection);

		resp.sendRedirect("index.jsp");
		
	}
}
