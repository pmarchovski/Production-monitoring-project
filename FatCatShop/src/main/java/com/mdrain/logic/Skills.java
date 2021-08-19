package com.mdrain.logic;

public class Skills {

	private String manualAssembly;
	private String solderingAssembly;
	private String test;
	private String trainer;
	private String deputyTeamLeader;
	private String packaging;
	private String materialsCollection;
	private String warehouse;
	
	public Skills() {
		this.manualAssembly = "Manual Assembly";
		this.solderingAssembly = "Soldering Assembly";
		this.test = "Test operator";
		this.trainer = "Trainer operator";
		this.deputyTeamLeader = "Deputy team leader";
		this.packaging = "Packaging operator";
		this.materialsCollection = "Materials collection";
		this.warehouse = "Warehouse operator";
	}
	
	public String getManualAssembly() {
		return manualAssembly;
	}
	public void setManualAssembly(String manualAssembly) {
		this.manualAssembly = manualAssembly;
	}
	public String getSolderingAssembly() {
		return solderingAssembly;
	}
	public void setSolderingAssembly(String solderingAssembly) {
		this.solderingAssembly = solderingAssembly;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public String getDeputyTeamLeader() {
		return deputyTeamLeader;
	}
	public void setDeputyTeamLeader(String deputyTeamLeader) {
		this.deputyTeamLeader = deputyTeamLeader;
	}

	public String getPackaging() {
		return packaging;
	}

	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}

	public String getMaterialsCollection() {
		return materialsCollection;
	}

	public void setMaterialsCollection(String materialsCollection) {
		this.materialsCollection = materialsCollection;
	}

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	
}

