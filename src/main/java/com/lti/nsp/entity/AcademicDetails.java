
package com.lti.nsp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NSP_TBL_STUDENT_ACADEMICS")
public class AcademicDetails {
	
	@Id
	@GeneratedValue
	private int academic_id;

	private String instituteName;
	private String presentCourse;
	private String presentYear;
	private String modeOfStudy;
	private String courseStartDate;
	private String boardName;
	private String previousCourseName;
	private String previousYear;
	private String previousYearPercent;
	
	private String tenthRollNum;
	private String tenthPercent;
	private String tenthBoardName;
	private String tenthPassingYear;
	
	private String twelvethRollNum;
	private String twelvethPercent;
	private String twelvethBoardName;
	private String twelvethPassingYear;
	
	//Getters and Setters......
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public String getPresentCourse() {
		return presentCourse;
	}
	public void setPresentCourse(String presentCourse) {
		this.presentCourse = presentCourse;
	}
	public String getPresentYear() {
		return presentYear;
	}
	public void setPresentYear(String presentYear) {
		this.presentYear = presentYear;
	}
	public String getModeOfStudy() {
		return modeOfStudy;
	}
	public void setModeOfStudy(String modeOfStudy) {
		this.modeOfStudy = modeOfStudy;
	}
	public String getCourseStartDate() {
		return courseStartDate;
	}
	public void setCourseStartDate(String courseStartDate) {
		this.courseStartDate = courseStartDate;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public String getPreviousCourseName() {
		return previousCourseName;
	}
	public void setPreviousCourseName(String previousCourseName) {
		this.previousCourseName = previousCourseName;
	}
	public String getPreviousYear() {
		return previousYear;
	}
	public void setPreviousYear(String previousYear) {
		this.previousYear = previousYear;
	}
	public String getTenthRollNum() {
		return tenthRollNum;
	}
	public void setTenthRollNum(String tenthRollNum) {
		this.tenthRollNum = tenthRollNum;
	}
	public String getTenthPercent() {
		return tenthPercent;
	}
	public void setTenthPercent(String tenthPercent) {
		this.tenthPercent = tenthPercent;
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
	public String getTwelvethRollNum() {
		return twelvethRollNum;
	}
	public void setTwelvethRollNum(String twelvethRollNum) {
		this.twelvethRollNum = twelvethRollNum;
	}
	public String getTwelvethPercent() {
		return twelvethPercent;
	}
	public void setTwelvethPercent(String twelvethPercent) {
		this.twelvethPercent = twelvethPercent;
	}
	public String getTwelvethBoardName() {
		return twelvethBoardName;
	}
	public void setTwelvethBoardName(String twelvethBoardName) {
		this.twelvethBoardName = twelvethBoardName;
	}
	public String getTwelvethPassingYear() {
		return twelvethPassingYear;
	}
	public void setTwelvethPassingYear(String twelvethPassingYear) {
		this.twelvethPassingYear = twelvethPassingYear;
	}
	public int getAcademic_id() {
		return academic_id;
	}
	public String getPreviousYearPercent() {
		return previousYearPercent;
	}
	public void setPreviousYearPercent(String previousYearPercent) {
		this.previousYearPercent = previousYearPercent;
	}
}
