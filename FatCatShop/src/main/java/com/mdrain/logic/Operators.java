package com.mdrain.logic;

public class Operators extends Users{

	private String teamLeader;
	private String gender;
	private String skills;
	private String isActive;
	private String isMotherhood;
    private String phone;
	
	public Operators() {
		super();
	
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Operators(int user_id) {
		super(user_id);
	
	}

	public Operators(String fullName) {
		super(fullName);
	
	}


	public String getTeamLeader() {
		return teamLeader;
	}


	public void setTeamLeader(String teamLeader) {
		this.teamLeader = teamLeader;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getSkills() {
		return skills;
	}


	public void setSkills(String skills) {
		this.skills = skills;
	}


	public String getIsActive() {
		return isActive;
	}


	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}


	public String getIsMotherhood() {
		return isMotherhood;
	}


	public void setIsMotherhood(String isMotherhood) {
		this.isMotherhood = isMotherhood;
	}


	

}
