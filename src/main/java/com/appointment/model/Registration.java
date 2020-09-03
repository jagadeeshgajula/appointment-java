package com.appointment.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="userdetails")
//@Data
public class Registration {

	@Id
	@Column(name="userid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;
	
	@Column(name="memberid",length=30,updatable = false)
	private String memberId;
	
	@Column(name="password")
	private String password;
	
	@Column(name="name")
	private String name;
	
	@Column(name="username",updatable = false)
	private String userName;
	
	@Column(name="guardiantype")
	private String guardianType;
	
	@Column(name="guardianname")
	private String guardianName;
	
	@Column(name="address")
	private String address;
	
	@Column(name="citizenship")
	private String citizenship;
	
	@Column(name="country")
	private String country;
	
	@Column(name="state")
	private String state;
	
	@Column(name="email")
	private String email;
	
	@Column(name="gender")
	private Character gender;
	
	@Column(name="maritalstatus")
	private Character maritalStatus;
	
	@Column(name="contactnumber")
	private String contactNumber;
	
	@Column(name="dateofbirth")
	private LocalDate dateOfBirth;
	
	@Column(name="registrationdate")
	private LocalDate registrationDate;
	
	@Column(name="timezone")
	private String timeZone;
	
	@Column(name="bloodtype")
	private String bloodType;
	
	@Column(name="countryvisited")
	private String countryVisited;
	
	@Column(name="citizenstatus")
	private String citizenStatus;
	
	
	@Column(name="displayname")
	private String displayName;
	
	
	
	@Column(name="supplierorinsurername")
	private String supplierorinsurername;
	
	
	
	@Column(name="SSNNumber")
	private String ssnNumber;



	public String getSsnNumber() {
		return ssnNumber;
	}



	public void setSsnNumber(String ssnNumber) {
		this.ssnNumber = ssnNumber;
	}



	public Integer getUserId() {
		return userId;
	}



	public void setUserId(Integer userId) {
		this.userId = userId;
	}



	public String getMemberId() {
		return memberId;
	}



	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getGuardianType() {
		return guardianType;
	}



	public void setGuardianType(String guardianType) {
		this.guardianType = guardianType;
	}



	public String getGuardianName() {
		return guardianName;
	}



	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCitizenship() {
		return citizenship;
	}



	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Character getGender() {
		return gender;
	}



	public void setGender(Character gender) {
		this.gender = gender;
	}



	public Character getMaritalStatus() {
		return maritalStatus;
	}



	public void setMaritalStatus(Character maritalStatus) {
		this.maritalStatus = maritalStatus;
	}



	public String getContactNumber() {
		return contactNumber;
	}



	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}



	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public LocalDate getRegistrationDate() {
		return registrationDate;
	}



	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}



	public String getTimeZone() {
		return timeZone;
	}



	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}



	public String getBloodType() {
		return bloodType;
	}



	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}



	public String getCountryVisited() {
		return countryVisited;
	}



	public void setCountryVisited(String countryVisited) {
		this.countryVisited = countryVisited;
	}



	public String getCitizenStatus() {
		return citizenStatus;
	}



	public void setCitizenStatus(String citizenStatus) {
		this.citizenStatus = citizenStatus;
	}



	public String getDisplayName() {
		return displayName;
	}



	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}



	public String getSupplierorinsurername() {
		return supplierorinsurername;
	}



	public void setSupplierorinsurername(String supplierorinsurername) {
		this.supplierorinsurername = supplierorinsurername;
	}



	



	public Registration() {
		super();
	}



	@Override
	public String toString() {
		return "Registration [userId=" + userId + ", memberId=" + memberId + ", password=" + password + ", name=" + name
				+ ", userName=" + userName + ", guardianType=" + guardianType + ", guardianName=" + guardianName
				+ ", address=" + address + ", citizenship=" + citizenship + ", country=" + country + ", state=" + state
				+ ", email=" + email + ", gender=" + gender + ", maritalStatus=" + maritalStatus + ", contactNumber="
				+ contactNumber + ", dateOfBirth=" + dateOfBirth + ", registrationDate=" + registrationDate
				+ ", timeZone=" + timeZone + ", bloodType=" + bloodType + ", countryVisited=" + countryVisited
				+ ", citizenStatus=" + citizenStatus + ", displayName=" + displayName + ", supplierorinsurername="
				+ supplierorinsurername + ", SSNNumber=" + ssnNumber + "]";
	}
	
	
	
	
	
}
