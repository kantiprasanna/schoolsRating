package com.example.school.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "schools")
public class School {
	
	@Column(name = "schoolRegistrationID")
	private long schoolRegistrationID;
	
	@Column(name = "schoolName")
	private String schoolName;
	
	@Column(name = "schoolAddress")
	private String schoolAddress;
	
	@Column (name = "schoolPhoneNumber")
	private String schoolPhoneNumber;
	

	public School() {
		
	}

	public School(long schoolRegistrationID, String schoolName, String schoolAddress, String schoolPhoneNumber) {
		super();
		this.schoolRegistrationID = schoolRegistrationID;
		this.schoolName = schoolName;
		this.schoolAddress = schoolAddress;
		this.schoolPhoneNumber = schoolPhoneNumber;
	}

	public long getSchoolRegistrationID() {
		return schoolRegistrationID;
	}

	public void setSchoolRegistrationID(long schoolRegistrationID) {
		this.schoolRegistrationID = schoolRegistrationID;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public String getSchoolPhoneNumber() {
		return schoolPhoneNumber;
	}

	public void setSchoolPhoneNumber(String schoolPhoneNumber) {
		this.schoolPhoneNumber = schoolPhoneNumber;
	}
	
	
}
