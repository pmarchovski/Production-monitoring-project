package com.mdrain.servlets;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mdrain.database.Database;
import com.mdrain.logic.PageViewCollection;
import com.mdrain.logic.Users;

public class LogServlet extends HttpServlet{
    
	Users users = new Users();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	    String mail     = req.getParameter("email"); //����� ������� �� ������� �� ����� � index.jsp
		String password = req.getParameter("user_password"); //����� ������� �� ������� �� ����� � index.jsp
		HttpSession session = req.getSession();
		
		if(mail.equals("") || (password.equals(""))) {
			session.setAttribute("massage", "������ e-mail � ������");
			
			
			resp.sendRedirect(PageViewCollection.INDEX);
			return;
		}
		
		Database db = Database.getInstance();
		
			
		ResultSet result = db.select("users");
		
		try {
			while (result.next()){			
				String tempMail = result.getString("email"); //����� ������� �� ������ �����
				String tempPass = result.getString("password"); //����� ������� �� ������ �����
				String user = result.getString("user_name");
				
				if (tempMail.equals(mail) && tempPass.equals(password)) {	
				session.setAttribute("is_access", true);
				session.setAttribute("user", user);	
				session.setAttribute("massage", "�������� ������� � ���������");
				
				resp.sendRedirect(PageViewCollection.INDEX);
					return;
				} 			
			}
			session.setAttribute("massage", "���� ����� ����������.");
			
			resp.sendRedirect(PageViewCollection.INDEX);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		session.removeAttribute("massage");
		session.removeAttribute("user");	
		session.invalidate();

		resp.sendRedirect(PageViewCollection.INDEX);
	}
	
}
