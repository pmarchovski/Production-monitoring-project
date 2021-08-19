package com.mdrain.servlets;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mdrain.database.Database;
import com.mdrain.logic.Operators;

 

public class ListServlet extends HttpServlet{

	
	Operators operators = new Operators();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		
		
		Database db = Database.getInstance();
		
		ArrayList<String> operatorsList = new ArrayList<>();
		
		HttpSession session = req.getSession();
		
		ResultSet result = db.select("operators");
		
		
		
		try {
			while(result.next()) {
				
				operators.setFullName(result.getString("operator_name"));
				
				operatorsList.add(operators.getFullName());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		session.setAttribute("operator_list", operatorsList);
		
		resp.sendRedirect("prod_input_data.jsp");
	}

}
