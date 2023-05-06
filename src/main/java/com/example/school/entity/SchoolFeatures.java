package com.example.school.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "schoolsFeatures")
public class SchoolFeatures {
	
	@Column(name = "schoolRegistrationID")
	private long schoolRegistrationID;
	
	@Column(name = "Transportation")
	private String Transportation;
	
	@Column(name = "Sports")
	private String Sports;
	
	@Column (name = "Board")
	private String Board;
	
	@Column (name = "IIT")
	private String IIT;
	
	@Column (name = "NEET")
	private String NEET;
	
	@Column (name = "Timings")
	private String Timings;
	
	@Column (name = "Fee")
	private String Fee;
	
	@Column (name = "CulturalActivies")
	private String CulturalActivies;
	
	@Column (name = "ExtraCircullarActivies")
	private String ExtraCircullarActivies;
	

	public SchoolFeatures() {
		
	}

	public SchoolFeatures(long schoolRegistrationID, String transportation, String sports, String board, String iIT,
			String nEET, String timings, String fee, String culturalActivies, String extraCircullarActivies) {
		super();
		this.schoolRegistrationID = schoolRegistrationID;
		Transportation = transportation;
		Sports = sports;
		Board = board;
		IIT = iIT;
		NEET = nEET;
		Timings = timings;
		Fee = fee;
		CulturalActivies = culturalActivies;
		ExtraCircullarActivies = extraCircullarActivies;
	}

	public long getSchoolRegistrationID() {
		return schoolRegistrationID;
	}

	public void setSchoolRegistrationID(long schoolRegistrationID) {
		this.schoolRegistrationID = schoolRegistrationID;
	}

	public String getTransportation() {
		return Transportation;
	}

	public void setTransportation(String transportation) {
		Transportation = transportation;
	}

	public String getSports() {
		return Sports;
	}

	public void setSports(String sports) {
		Sports = sports;
	}

	public String getBoard() {
		return Board;
	}

	public void setBoard(String board) {
		Board = board;
	}

	public String getIIT() {
		return IIT;
	}

	public void setIIT(String iIT) {
		IIT = iIT;
	}

	public String getNEET() {
		return NEET;
	}

	public void setNEET(String nEET) {
		NEET = nEET;
	}

	public String getTimings() {
		return Timings;
	}

	public void setTimings(String timings) {
		Timings = timings;
	}

	public String getFee() {
		return Fee;
	}

	public void setFee(String fee) {
		Fee = fee;
	}

	public String getCulturalActivies() {
		return CulturalActivies;
	}

	public void setCulturalActivies(String culturalActivies) {
		CulturalActivies = culturalActivies;
	}

	public String getExtraCircullarActivies() {
		return ExtraCircullarActivies;
	}

	public void setExtraCircullarActivies(String extraCircullarActivies) {
		ExtraCircullarActivies = extraCircullarActivies;
	}

}
