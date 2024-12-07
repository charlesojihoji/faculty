package edu.uoengland.faculty.dto;

import java.util.UUID;

public class FacultyDTO {

	private UUID id;
	
	private String fullName;
	
	private String address;
	
	private String phoneNumber;
	
	private String emailAddress;

	public FacultyDTO() {
		super();
	}

	public FacultyDTO(UUID id, String fullName, String address, String phoneNumber, String emailAddress, float gpa) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
}
