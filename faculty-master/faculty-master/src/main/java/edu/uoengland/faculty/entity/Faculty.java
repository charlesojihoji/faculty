package edu.uoengland.faculty.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="Faculty")
public class Faculty {

	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
	@Column(name="id")
	private UUID id;
	
	@Column(name="full_Name", nullable=false)
	private String fullName;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="email_address", unique=true)
	private String emailAddress;
	
	public Faculty() {
		super();
	}

	public Faculty(UUID id, String fullName, String address, String phoneNumber, String emailAddress, float gpa) {
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
