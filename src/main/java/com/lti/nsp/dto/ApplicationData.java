package com.lti.nsp.dto;

public class ApplicationData extends ApplicationDTO {

	private int app_id;
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
	private String tenthMarkPath;
	private String twelvethMarkPath;

	public String getTenthMarkPath() {
		return tenthMarkPath;
	}

	public void setTenthMarkPath(String tenthMarkPath) {
		this.tenthMarkPath = tenthMarkPath;
	}

	public String getTwelvethMarkPath() {
		return twelvethMarkPath;
	}

	public void setTwelvethMarkPath(String twelvethMarkPath) {
		this.twelvethMarkPath = twelvethMarkPath;
	}

	public int getApp_id() {
		return app_id;
	}

	public void setApp_id(int app_id) {
		this.app_id = app_id;
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

	public void setMobileNo(String i) {
		this.mobileNo = i;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
