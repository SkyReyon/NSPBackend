package com.lti.nsp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NSP_TBL_NODAL_OFFICER")
public class NodalOfficer {

	@Id
	@GeneratedValue
	private int nodal_id;
	private String name;
	private String userName;
	private String password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getNodal_id() {
		return nodal_id;
	}

	
}
