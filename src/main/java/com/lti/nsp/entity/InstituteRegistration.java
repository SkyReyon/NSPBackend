package com.lti.nsp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NSP_TBL_INSTITUTE_REGISTRATION")
public class InstituteRegistration {


	@Id
	@GeneratedValue
	private int instReg_id;
	private String instName;
	private String instCode;
	private String diseCode;
	private String affName;
	private String affState;
	private String password;
	private String status;
	private String instAdd1;
	private String instAdd2;
	private String instCity;
	private String instState;
	private String instDistrict;
	private String instPincode;
	private String principalName;
	private String mobileNumber;
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getInstName() {
		return instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}
	public String getInstCode() {
		return instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}
	public String getDiseCode() {
		return diseCode;
	}
	public void setDiseCode(String diseCode) {
		this.diseCode = diseCode;
	}
	public String getAffName() {
		return affName;
	}
	public void setAffName(String affName) {
		this.affName = affName;
	}
	public String getAffState() {
		return affState;
	}
	public void setAffState(String affState) {
		this.affState = affState;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getInstAdd1() {
		return instAdd1;
	}
	public void setInstAdd1(String instAdd1) {
		this.instAdd1 = instAdd1;
	}
	public String getInstAdd2() {
		return instAdd2;
	}
	public void setInstAdd2(String instAdd2) {
		this.instAdd2 = instAdd2;
	}
	public String getInstCity() {
		return instCity;
	}
	public void setInstCity(String instCity) {
		this.instCity = instCity;
	}
	public String getInstState() {
		return instState;
	}
	public void setInstState(String instState) {
		this.instState = instState;
	}
	public String getInstDistrict() {
		return instDistrict;
	}
	public void setInstDistrict(String instDistrict) {
		this.instDistrict = instDistrict;
	}
	public String getInstPincode() {
		return instPincode;
	}
	public void setInstPincode(String instPincode) {
		this.instPincode = instPincode;
	}
	public String getPrincipalName() {
		return principalName;
	}
	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getInstReg_id() {
		return instReg_id;
	}
	@Override
	public String toString() {
		return "InstituteRegistration [instReg_id=" + instReg_id + ", instName=" + instName + ", instCode=" + instCode
				+ ", diseCode=" + diseCode + ", affName=" + affName + ", affState=" + affState + ", password="
				+ password + ", status=" + status + ", instAdd1=" + instAdd1 + ", instAdd2=" + instAdd2 + ", instCity="
				+ instCity + ", instState=" + instState + ", instDistrict=" + instDistrict + ", instPincode="
				+ instPincode + ", principalName=" + principalName + ", mobileNumber=" + mobileNumber + "]";
	}
	
	
}