package com.lti.nsp.dto;

import java.util.List;

public class NodalDTO {

	List<InstituteData> institutes ;
	List<ApplicationData> students;
	String studentData;
	String instituteData;
	
	
	public String getStudentData() {
		return studentData;
	}
	public void setStudentData(String studentData) {
		this.studentData = studentData;
	}
	public String getInstituteData() {
		return instituteData;
	}
	public void setInstituteData(String instituteData) {
		this.instituteData = instituteData;
	}
	public List<InstituteData> getInstitutes() {
		return institutes;
	}
	public void setInstitutes(List<InstituteData> institutes) {
		this.institutes = institutes;
	}
	public List<ApplicationData> getStudents() {
		return students;
	}
	public void setStudents(List<ApplicationData> students) {
		this.students = students;
	}
	
	
}
