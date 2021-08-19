package com.mdrain.servlets;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mdrain.database.Database;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Statement;

public class SqlServlet extends HttpServlet {

	String fname;
	String extraName;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Database db = Database.getInstance();
				
		ResultSet collection = db.select("users");
		
		try {
			while (collection.next()) {
				
				fname = collection.getString("first_name");
				extraName = collection.getString("second_name");
				
				System.out.print(collection.getString("first_name"));
				System.out.print(collection.getString("second_name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
