package com.darshanbtp.demo.com.entities;

import java.util.Date;
import org.springframework.stereotype.Component;

@Component
public class vendor {
	
	private String code;
	private String companyName;
	private String contactPerson;
	private String firstName;
	private String lastName;
	private String website;
	private String email;
	private String status;
	private Date  regDate;
	
	public vendor() {
		super();
		this.code = "0001";
		this.companyName = "WiproBulbs";
		this.contactPerson = "Ajit Premaji";
		this.firstName = "Darshan";
		this.lastName =	"Shetty" ;
		this.website = "WWW.WIPRO.COM";
		this.email = "darshanshetty555@gmail.com";
		this.status = "Functional";
		this.regDate = new Date();
	}
	@Override
	public String toString() {
		return "vendor [code=" + code + ", companyName=" + companyName + ", contactPerson=" + contactPerson
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", website=" + website + ", email=" + email
				+ ", status=" + status + ", regDate=" + regDate + "]";
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	

}
