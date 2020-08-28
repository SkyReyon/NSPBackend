package com.lti.nsp.dto;

public class LoginDTO {

	private int id;
	private String uid;
	private String password;
	private String instituteId;
	private String instCode;
	private String userName;
	private String operation;
	
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInstituteId() {
		return instituteId;
	}
	public void setInstituteId(String instituteId) {
		this.instituteId = instituteId;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getInstCode() {
		return instCode;	
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}
	
	
}
