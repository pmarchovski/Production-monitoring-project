package com.mdrain.database;

import java.util.Properties;

public class DataBaseConfig {
	
	public static final String DRIVER = "mysql";
	public static final String PORT = "3306";
	public static final String DATABASE = "aps_staff";
	public static final String USER = "root";
	public static final String PASSWORD = "";

	public static String driverData = null;
	
	public static String getUrl() {
		
		 try {
			driverData = "jdbc:"
			+ DRIVER 
			+ "://localhost:" 
			+ PORT 
			+ "/" 
			+ DATABASE;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(driverData);
		
		return  driverData;
		
	}
	
	
	public static Properties getCredentials() {
		
		java.util.Properties credentials = new java.util.Properties();
		
		if (USER != null) credentials.put("user",  USER);	
		if (PASSWORD != null) credentials.put("password", PASSWORD);
		
		System.out.println(credentials);
		
		return credentials;
	}
}
