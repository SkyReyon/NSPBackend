package com.lti.nsp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NSP_TBL_STUDENT_FEE")
public class FeeDetails {

	@Id
	@GeneratedValue
	private int fee_id;
	private String admissionFee;
	private String tutionFee;
	private String otherFee;
	
	//getters and setters
	public String getAdmissionFee() {
		return admissionFee;
	}
	public void setAdmissionFee(String admissionFee) {
		this.admissionFee = admissionFee;
	}
	public String getTutionFee() {
		return tutionFee;
	}
	public void setTutionFee(String tutionFee) {
		this.tutionFee = tutionFee;
	}
	public String getOtherFee() {
		return otherFee;
	}
	public void setOtherFee(String otherFee) {
		this.otherFee = otherFee;
	}
	public int getFee_id() {
		return fee_id;
	}
	
	
	
}
