package com.mdrain.database;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Database {
	
		String quote = "'";
		String clambStart = "(";
		String clambEnd = ")";
		String comma = ", ";
	
	private Connection connection;
	private static Database instance = null;
	
	private Database() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {	
			e1.printStackTrace();
		}
		
		try {
			this.connection = DriverManager.getConnection(
					DataBaseConfig.getUrl(), 
					DataBaseConfig.getCredentials());
			System.out.println("Connection success");
		} catch (SQLException e) {
			e.printStackTrace();
		}			
	}
	
	public static Database getInstance() {
		
		if(instance == null) {
			instance = new Database();
		}
		
		return instance;
		
	}
	

	public void insertUsers(String fullName, String userName, String email, String password) {
			
		String dataColumn = clambStart 
				            + quote + fullName + quote + comma 
				            + quote + userName + quote + comma 
				            + quote + email + quote + comma
				            + quote + password + quote
				            + clambEnd;
		
		try {
			Statement queryManager = this.connection.createStatement();
			queryManager.execute("INSERT INTO users (full_name, user_name, email, password) VALUES " + dataColumn);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertProductionInfo(String m_date, String productionOrder, String operator, int productionTime, int quantity, boolean isNewOperator) {
		
		String dataColumn = clambStart 
	            + quote + m_date + quote + comma 
	            + quote + productionOrder + quote + comma 
	            + quote + operator + quote + comma
	            + quote + productionTime + quote + comma
	            + quote + quantity + quote + comma    
	            + quote + isNewOperator + quote
	            + clambEnd;
		
		Statement queryManager;
		try {
			queryManager = this.connection.createStatement();
			queryManager.execute("INSERT INTO production_info (m_date, production_order, operator, production_time, quantity, new_operator) VAUES " + dataColumn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void insertOperatorsInfo(String fullName, String teamLeader, String gender, String skills, String isActive, String isMotherhood, String phone) {
		
		String dataColumn = clambStart 
	            + quote + fullName + quote + comma 
	            + quote + teamLeader + quote + comma 
	            + quote + gender + quote + comma
	            + quote + skills + quote + comma
	            + quote + isActive + quote + comma    
	            + quote + isMotherhood + quote + comma
	            + quote + phone + quote
	            + clambEnd;
		
		Statement queryManager;
		try {
			queryManager = this.connection.createStatement();
			queryManager.execute("INSERT INTO operators (operator_name, team_leader, gender, skills, isActive, isMotherhood, phone) VALUES " + dataColumn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
		try {
			Statement queryManager = this.connection.createStatement();
			queryManager.execute("DELETE FROM users WHERE password is NULL");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public ResultSet select(String table) {
		
		String query = "SELECT * FROM " + table;
		
		try {
			Statement queryManager = this.connection.createStatement();
		    return queryManager.executeQuery(query);
		} catch (SQLException e) {	
			e.printStackTrace();
		}

		return null;
	}
	
	public ResultSet select(String table, String field) {
		
		String query = "SELECT * FROM " + table + " WHERE " + field;
		
		 Statement queryManager;
		try {
			queryManager = this.connection.createStatement();
			return queryManager.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		 
	}
	
}
