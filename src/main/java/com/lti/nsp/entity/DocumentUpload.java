package com.lti.nsp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "NSP_TBL_STUDENT_DOCS")
public class DocumentUpload {

	@Id
	@GeneratedValue
	private int docs_id;
	private String domicileCertificate;
	private String studentPhoto;
	private String instIdCard;
	private String incomeCertificate;
	private String preYearMarksheet;
	private String currFeeReciept;
	private String bankPassbook;
	private String aadharCard;
	private String tenthMarksheet;
	private String twelvethMarksheet;
	
	public String getDomicileCertificate() {
		return domicileCertificate;
	}
	public void setDomicileCertificate(String domicileCertificate) {
		this.domicileCertificate = domicileCertificate;
	}
	public String getStudentPhoto() {
		return studentPhoto;
	}
	public void setStudentPhoto(String studentPhoto) {
		this.studentPhoto = studentPhoto;
	}
	public String getInstIdCard() {
		return instIdCard;
	}
	public void setInstIdCard(String instIdCard) {
		this.instIdCard = instIdCard;
	}
	public String getIncomeCertificate() {
		return incomeCertificate;
	}
	public void setIncomeCertificate(String incomeCertificate) {
		this.incomeCertificate = incomeCertificate;
	}
	public String getPreYearMarksheet() {
		return preYearMarksheet;
	}
	public void setPreYearMarksheet(String preYearMarksheet) {
		this.preYearMarksheet = preYearMarksheet;
	}
	public String getCurrFeeReciept() {
		return currFeeReciept;
	}
	public void setCurrFeeReciept(String currFeeReciept) {
		this.currFeeReciept = currFeeReciept;
	}
	public String getBankPassbook() {
		return bankPassbook;
	}
	public void setBankPassbook(String bankPassbook) {
		this.bankPassbook = bankPassbook;
	}
	public String getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}
	public String getTenthMarksheet() {
		return tenthMarksheet;
	}
	public void setTenthMarksheet(String tenthMarksheet) {
		this.tenthMarksheet = tenthMarksheet;
	}
	public String getTwelvethMarksheet() {
		return twelvethMarksheet;
	}
	public void setTwelvethMarksheet(String twelvethMarksheet) {
		this.twelvethMarksheet = twelvethMarksheet;
	}
	public int getDocs_id() {
		return docs_id;
	}
}
