package com.lti.nsp.dto;

import org.springframework.web.multipart.MultipartFile;

public class ApplicationDTO {
	
	private int reg_id;
	private String religion;
	private String category;
	private String income;
	private String father;
	private String mother;
	private String instituteName;
	private String presentClass;
	private String presentCourseYear;
	private String modeOfStudy;
	private String classStartDate;
	private String universityBoardName;
	private String previousClassCourse;
	private String previousPassingYear;
	private String previousCoursePercent;
	private String tenthRollNo;
	private String tenthBoardName;
	private String tenthPassingYear;
	private String tenthMarksObtained;
	private String twelfthRollNo;
	private String twelfthBoardName;
	private String twelfthPassingYear;
	private String twelfthMarksObtained;
	private String admissionFee;
	private String tuitionFee;
	private String otherFee;
	private String isDisable;
	private String disabilityType;
	private String percentOfDisabilty;
	private String parentProfession;
	private String scholarState;
	private String scholarDistrict;
	private String scholarBlock;
	private String houseNo;
	private String streetNo;
	private String pincode;
	private String scheme;
	

	private MultipartFile domicileCertificate;
	private MultipartFile stuPhoto;
	private MultipartFile instIdCard;
	private MultipartFile incomeCertificate;
	private MultipartFile prevMarksheet;
	private MultipartFile currReciept;
	private MultipartFile bankPassbook;
	private MultipartFile aadharCard;
	private MultipartFile tenthMarksheet;
	private MultipartFile twelvethMarksheet;
	//getters and setters
	
	public int getReg_id() {
		return reg_id;
	}

	public void setReg_id(int reg_id) {
		this.reg_id = reg_id;
	}
	public String getReligion() {
		return religion;
	}
	public MultipartFile getDomicileCertificate() {
		return domicileCertificate;
	}
	public void setDomicileCertificate(MultipartFile domicileCertificate) {
		this.domicileCertificate = domicileCertificate;
	}
	public MultipartFile getStuPhoto() {
		return stuPhoto;
	}
	public void setStuPhoto(MultipartFile stuPhoto) {
		this.stuPhoto = stuPhoto;
	}
	public MultipartFile getInstIdCard() {
		return instIdCard;
	}
	public void setInstIdCard(MultipartFile instIdCard) {
		this.instIdCard = instIdCard;
	}
	public MultipartFile getIncomeCertificate() {
		return incomeCertificate;
	}
	public void setIncomeCertificate(MultipartFile incomeCertificate) {
		this.incomeCertificate = incomeCertificate;
	}
	public MultipartFile getPrevMarksheet() {
		return prevMarksheet;
	}
	public void setPrevMarksheet(MultipartFile prevMarksheet) {
		this.prevMarksheet = prevMarksheet;
	}
	public MultipartFile getCurrReciept() {
		return currReciept;
	}
	public void setCurrReciept(MultipartFile currReciept) {
		this.currReciept = currReciept;
	}
	public MultipartFile getBankPassbook() {
		return bankPassbook;
	}
	public void setBankPassbook(MultipartFile bankPassbook) {
		this.bankPassbook = bankPassbook;
	}
	public MultipartFile getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(MultipartFile aadharCard) {
		this.aadharCard = aadharCard;
	}
	public MultipartFile getTenthMarksheet() {
		return tenthMarksheet;
	}
	public void setTenthMarksheet(MultipartFile tenthMarksheet) {
		this.tenthMarksheet = tenthMarksheet;
	}
	public MultipartFile getTwelvethMarksheet() {
		return twelvethMarksheet;
	}
	public void setTwelvethMarksheet(MultipartFile twelvethMarksheet) {
		this.twelvethMarksheet = twelvethMarksheet;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getCategory() {
		return category;
	}
	public void setCommunity(String category) {
		this.category = category;
	}
	public String getIncome() {
		return income;
	}
	public void setIncome(String income) {
		this.income = income;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public String getMother() {
		return mother;
	}
	public void setMother(String mother) {
		this.mother = mother;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public String getPresentClass() {
		return presentClass;
	}
	public void setPresentClass(String presentClass) {
		this.presentClass = presentClass;
	}
	public String getPresentCourseYear() {
		return presentCourseYear;
	}
	public void setPresentCourseYear(String presentCourseYear) {
		this.presentCourseYear = presentCourseYear;
	}
	public String getModeOfStudy() {
		return modeOfStudy;
	}
	public void setModeOfStudy(String modeOfStudy) {
		this.modeOfStudy = modeOfStudy;
	}
	public String getClassStartDate() {
		return classStartDate;
	}
	public void setClassStartDate(String classStartDate) {
		this.classStartDate = classStartDate;
	}
	public String getUniversityBoardName() {
		return universityBoardName;
	}
	public void setUniversityBoardName(String universityBoardName) {
		this.universityBoardName = universityBoardName;
	}
	public String getPreviousClassCourse() {
		return previousClassCourse;
	}
	public void setPreviousClassCourse(String previousClassCourse) {
		this.previousClassCourse = previousClassCourse;
	}
	public String getPreviousPassingYear() {
		return previousPassingYear;
	}
	public void setPreviousPassingYear(String previousPassingYear) {
		this.previousPassingYear = previousPassingYear;
	}
	public String getPreviousCoursePercent() {
		return previousCoursePercent;
	}
	public void setPreviousCoursePercent(String previousCoursePercent) {
		this.previousCoursePercent = previousCoursePercent;
	}
	public String getTenthRollNo() {
		return tenthRollNo;
	}
	public void setTenthRollNo(String tenthRollNo) {
		this.tenthRollNo = tenthRollNo;
	}
	public String getTenthBoardName() {
		return tenthBoardName;
	}
	public void setTenthBoardName(String tenthBoardName) {
		this.tenthBoardName = tenthBoardName;
	}
	public String getTenthPassingYear() {
		return tenthPassingYear;
	}
	public void setTenthPassingYear(String tenthPassingYear) {
		this.tenthPassingYear = tenthPassingYear;
	}
	public String getTenthMarksObtained() {
		return tenthMarksObtained;
	}
	public void setTenthMarksObtained(String tenthMarksObtained) {
		this.tenthMarksObtained = tenthMarksObtained;
	}
	public String getTwelfthRollNo() {
		return twelfthRollNo;
	}
	public void setTwelfthRollNo(String twelfthRollNo) {
		this.twelfthRollNo = twelfthRollNo;
	}
	public String getTwelfthBoardName() {
		return twelfthBoardName;
	}
	public void setTwelfthBoardName(String twelfthBoardName) {
		this.twelfthBoardName = twelfthBoardName;
	}
	public String getTwelfthPassingYear() {
		return twelfthPassingYear;
	}
	public void setTwelfthPassingYear(String twelfthPassingYear) {
		this.twelfthPassingYear = twelfthPassingYear;
	}
	public String getTwelfthMarksObtained() {
		return twelfthMarksObtained;
	}
	public void setTwelfthMarksObtained(String twelfthMarksObtained) {
		this.twelfthMarksObtained = twelfthMarksObtained;
	}
	public String getAdmissionFee() {
		return admissionFee;
	}
	public void setAdmissionFee(String admissionFee) {
		this.admissionFee = admissionFee;
	}
	public String getTuitionFee() {
		return tuitionFee;
	}
	public void setTuitionFee(String tuitionFee) {
		this.tuitionFee = tuitionFee;
	}
	public String getOtherFee() {
		return otherFee;
	}
	public void setOtherFee(String otherFee) {
		this.otherFee = otherFee;
	}
	public String getIsDisable() {
		return isDisable;
	}
	public void setIsDisable(String isDisable) {
		this.isDisable = isDisable;
	}
	public String getDisabilityType() {
		return disabilityType;
	}
	public void setDisabilityType(String disabilityType) {
		this.disabilityType = disabilityType;
	}
	public String getPercentOfDisabilty() {
		return percentOfDisabilty;
	}
	public void setPercentOfDisabilty(String percentOfDisabilty) {
		this.percentOfDisabilty = percentOfDisabilty;
	}
	public String getParentProfession() {
		return parentProfession;
	}
	public void setParentProfession(String parentProfession) {
		this.parentProfession = parentProfession;
	}
	public String getScholarState() {
		return scholarState;
	}
	public void setScholarState(String scholarState) {
		this.scholarState = scholarState;
	}
	public String getScholarDistrict() {
		return scholarDistrict;
	}
	public void setScholarDistrict(String scholarDistrict) {
		this.scholarDistrict = scholarDistrict;
	}
	public String getScholarBlock() {
		return scholarBlock;
	}
	public void setScholarBlock(String scholarBlock) {
		this.scholarBlock = scholarBlock;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getScheme() {
		return scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
}
