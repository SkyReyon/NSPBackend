package com.lti.nsp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NSP_TBL_STUDENT_BANK")
public class BankDetails {

	@Id
	@GeneratedValue
	private int bank_id;
	private String acno;
	private String ifsc;
	private String bankName;
	
	//generate getters and setters
	
	public String getAcno() {
		return acno;
	}
	public void setAcno(String acno) {
		this.acno = acno;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getBank_id() {
		return bank_id;
	}	
}
