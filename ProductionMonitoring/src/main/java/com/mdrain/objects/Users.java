package com.mdrain.objects;

public class Users {

	private int user_id;
	private String fullName;
	private String userName;
	private String email;
	private String password;

	public Users(int user_id, String fullName, String userName, String email, String password) {
      
	  this.user_id = user_id;
	  this.fullName = fullName;
      this.userName = userName;
      this.email = email;
      this.password = password;
	}
	
	public Users(String fullName) {
		
		this.fullName = fullName;
	}
	
public Users(int user_id) {
		
		this.user_id = user_id;
	}

	public Users() {
		
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	
}