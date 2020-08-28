package com.lti.nsp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NSP_TBL_STUDENT_DISABILITY")
public class Disability {

	@Id
	@GeneratedValue
	private int disability_id;
	private String DisabilityName;
	private String TypeOfDisability;
	private double percentageOfDisability;
	public int getDisability_id() {
		return disability_id;
	}
	
	public String getDisabilityName() {
		return DisabilityName;
	}
	public void setDisabilityName(String disabilityName) {
		DisabilityName = disabilityName;
	}
	public String getTypeOfDisability() {
		return TypeOfDisability;
	}
	public void setTypeOfDisability(String typeOfDisability) {
		TypeOfDisability = typeOfDisability;
	}
	public double getPercentageOfDisability() {
		return percentageOfDisability;
	}
	public void setPercentageOfDisability(double percentageOfDisability) {
		this.percentageOfDisability = percentageOfDisability;
	}
	
	
}
