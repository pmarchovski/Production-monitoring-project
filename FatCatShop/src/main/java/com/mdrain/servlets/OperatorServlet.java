package com.mdrain.servlets;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mdrain.database.Database;
import com.mdrain.logic.Operators;

public class OperatorServlet extends HttpServlet {

	Operators dataOperators = new Operators();
	
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String action = req.getServletPath();
		switch (action) {
		case "/add_operator":
			addOperator(req, resp);
			break;
		case "/list_operator":
			listOperator(req, resp);
			break;
		default:
			listOperator(req, resp);
		}

	}

	private void addOperator(HttpServletRequest req, HttpServletResponse resp) {

		Database db = Database.getInstance();

		dataOperators.setFullName(req.getParameter("operator_name"));
		dataOperators.setTeamLeader(req.getParameter("team_leader"));
		dataOperators.setGender(req.getParameter("gender"));
		dataOperators.setSkills(req.getParameter("skills"));
		dataOperators.setIsActive(req.getParameter("isActive"));
		dataOperators.setIsMotherhood(req.getParameter("isMotherhood"));
		dataOperators.setPhone(req.getParameter("phone"));

		db.insertOperatorsInfo(dataOperators.getFullName(), dataOperators.getTeamLeader(), dataOperators.getGender(),
				dataOperators.getSkills(), dataOperators.getIsActive(), dataOperators.getIsMotherhood(),
				dataOperators.getPhone());

		try {
			resp.sendRedirect("input_operators.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	private void listOperator(HttpServletRequest req, HttpServletResponse resp) {
		
		
		Database db = Database.getInstance();
		ResultSet list = db.select("operators");
		ArrayList<Operators> collectionOperators = new ArrayList<>();
		HttpSession session = req.getSession();
		
		try {
			while (list.next());
			
			Operators operator = new Operators();
			
			dataOperators.setFullName(list.getString("operator_name"));
			dataOperators.setTeamLeader(list.getString("team_leader"));
			dataOperators.setGender(list.getString("gender"));
			dataOperators.setIsActive("isActive");
			dataOperators.setPhone("phone");
			
			collectionOperators.add(operator);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String tableTop = "	<table class=\"table table-bordered\">\r\n"
				+ "		<thead>\r\n"
				+ "			<tr>\r\n"
				+ "				<th>Име презиме фамилия</th>\r\n"
				+ "				<th>Тийм Лидер</th>\r\n"
				+ "				<th>Пол</th>\r\n"
				+ "				<th>Активен</th>\r\n"
				+ "				<th>Телефон</th>\r\n"
				+ "          \r\n"
				+ "			</tr>\r\n"
				+ "		</thead>\r\n"
				+ "		<tbody>";
		
		String tableBottom = "	</tbody>\r\n"
				+ "\r\n"
				+ "	</table>";
		
		session.setAttribute("table_top", tableTop);
		session.setAttribute("table_bottom", tableBottom);
		session.setAttribute("collection_operators", collectionOperators);

		try {
			resp.sendRedirect("blank.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
