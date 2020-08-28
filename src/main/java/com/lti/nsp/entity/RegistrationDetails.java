package com.lti.nsp.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="NSP_TBL_STUDENT_REGDETAILS")
public class RegistrationDetails {

	@Id
	@GeneratedValue
	private int reg_id;
	private String stuName;
	private String gender;
	private String dob;
	private String mobileNo;
	private String district;
	private String state;
	private String email;
	private String instCode;
	private String adharNo;
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails bankDetails;

	@OneToMany(mappedBy = "registrationDetails" , fetch = FetchType.EAGER) 
	private Set<ApplicationDetails> applicationDetails;
	
	public BankDetails getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}	
	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String string) {
		this.mobileNo = string ;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInstCode() {
		return instCode;
	}

	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}	 

	public Set<ApplicationDetails> getApplicationDetails() {
		return applicationDetails;
	}

	public void setApplicationDetails(Set<ApplicationDetails> applicationDetails) {
		this.applicationDetails = applicationDetails;
	}

	public int getReg_id() {
		return reg_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
