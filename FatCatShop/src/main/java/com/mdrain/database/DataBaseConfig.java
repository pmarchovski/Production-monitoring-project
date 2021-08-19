package com.mdrain.database;

import java.util.Properties;

public class DataBaseConfig {
	
	public static final String DRIVER = "mysql";
	public static final String PORT = "3306";
	public static final String DATABASE = "aps_staff";
	public static final String USER = "root";
	public static final String PASSWORD = "";
	
	
	public static String getUrl() {
		
		return "jdbc:"
		+ DRIVER 
		+ "://localhost:" 
		+ PORT 
		+ "/" 
		+ DATABASE;
	}
	
	public static Properties getCredentials() {
		
		java.util.Properties credentials = new java.util.Properties();
		
		if (USER != null) credentials.put("user",  USER);	
		if (PASSWORD != null) credentials.put("password", PASSWORD);
		
		return credentials;
	}
}
