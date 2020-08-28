package com.lti.nsp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NSP_TBL_STUDENT_BASIC")
public class BasicDetails {

	@Id
	@GeneratedValue
	private int basic_id;
	private String FatherName;
    private String MotherName;
	private String Category;
    private String Religion;
    private String ParentProfession;
    private String AnnualIncome;
	public int getBasic_id() {
		return basic_id;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public String getMotherName() {
		return MotherName;
	}
	public void setMotherName(String motherName) {
		MotherName = motherName;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getReligion() {
		return Religion;
	}
	public void setReligion(String religion) {
		Religion = religion;
	}
	public String getParentProfession() {
		return ParentProfession;
	}
	public void setParentProfession(String parentProfession) {
		ParentProfession = parentProfession;
	}
	public String getAnnualIncome() {
		return AnnualIncome;
	}
	public void setAnnualIncome(String annualIncome) {
		AnnualIncome = annualIncome;
	}
	
    
	
	
}
