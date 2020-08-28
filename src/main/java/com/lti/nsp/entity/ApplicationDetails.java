package com.lti.nsp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="NSP_TBL_STUDENT_APPLICATION")
public class ApplicationDetails {

	@Id
	@GeneratedValue
	private int application_id;
	private String scholarshipScheme;
	private String scholarshipDetails;
	private String bonafideCertificate;
	private String status;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails bankDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AcademicDetails academicDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BasicDetails basicDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ContactDetails contactDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Disability disability;
	
	@OneToOne(cascade = CascadeType.ALL)
	private  FeeDetails feeDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private  DocumentUpload documentUpload;

	@ManyToOne(cascade = CascadeType.ALL)
	private RegistrationDetails registrationDetails;
	
	
	public RegistrationDetails getRegistrationDetails() {
		return registrationDetails;
	}

	public void setRegistrationDetails(RegistrationDetails registrationDetails) {
		this.registrationDetails = registrationDetails;
	}
	
	public String getScholarshipScheme() {
		return scholarshipScheme;
	}

	public void setScholarshipScheme(String scholarshipScheme) {
		this.scholarshipScheme = scholarshipScheme;
	}

	public String getScholarshipDetails() {
		return scholarshipDetails;
	}

	public void setScholarshipDetails(String scholarshipDetails) {
		this.scholarshipDetails = scholarshipDetails;
	}

	public BankDetails getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}

	public AcademicDetails getAcademicDetails() {
		return academicDetails;
	}

	public void setAcademicDetails(AcademicDetails academicDetails) {
		this.academicDetails = academicDetails;
	}

	public BasicDetails getBasicDetails() {
		return basicDetails;
	}

	public void setBasicDetails(BasicDetails basicDetails) {
		this.basicDetails = basicDetails;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

	

	public Disability getDisability() {
		return disability;
	}

	public void setDisability(Disability disability) {
		this.disability = disability;
	}

	public FeeDetails getFeeDetails() {
		return feeDetails;
	}

	public void setFeeDetails(FeeDetails feeDetails) {
		this.feeDetails = feeDetails;
	}

	public int getApplication_id() {
		return application_id;
	}
	
	public DocumentUpload getDocumentUpload() {
		return documentUpload;
	}

	public void setDocumentUpload(DocumentUpload documentUpload) {
		this.documentUpload = documentUpload;
	}
	
	public String getBonafideCertificate() {
		return bonafideCertificate;
	}

	public void setBonafideCertificate(String bonafideCertificate) {
		this.bonafideCertificate = bonafideCertificate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
