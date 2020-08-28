package com.lti.nsp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.lti.nsp.dao.InstituteDao;
import com.lti.nsp.dao.StudentDao;
import com.lti.nsp.dto.ApplicationDTO;
import com.lti.nsp.dto.ApplicationData;
import com.lti.nsp.dto.InstRegistrationDTO;
import com.lti.nsp.entity.ApplicationDetails;
import com.lti.nsp.entity.InstituteRegistration;
import com.lti.nsp.entity.RegistrationDetails;
import com.lti.nsp.exception.NoUserException;
import com.lti.nsp.interfaces.GenericDao;

@Service
public class InstituteService {

	@Autowired
	InstituteDao instDao;

	public void addInstDetails(InstRegistrationDTO dto) {

		InstituteRegistration regdetails = new InstituteRegistration();

		regdetails.setInstName(dto.getInstName());
		regdetails.setInstCode(dto.getInstCode());
		regdetails.setDiseCode(dto.getDiseCode());
		regdetails.setAffName(dto.getAffName());
		regdetails.setAffState(dto.getAffState());
		regdetails.setPassword(dto.getPassword());
		regdetails.setInstAdd1(dto.getInstAdd1());
		regdetails.setInstAdd2(dto.getInstAdd2());
		regdetails.setInstCity(dto.getInstCity());
		regdetails.setInstState(dto.getInstState());
		regdetails.setInstDistrict(dto.getInstDistrict());
		regdetails.setInstPincode(dto.getInstPincode());
		regdetails.setPrincipalName(dto.getPrincipalName());
		regdetails.setMobileNumber(dto.getMobileNumber());
		regdetails.setStatus("on-process");
		
		instDao.add(regdetails);

	}

	public List<InstituteRegistration> fetchAllInst() {
		return instDao.fetchAllInst();
	}

	public List<ApplicationData> fetchAllApplications(String instiCode) {
		List<ApplicationDetails> appDetails = instDao.fetchInstituteStudents(instiCode);
		List<ApplicationData> dataList = new ArrayList<ApplicationData>();

		for (ApplicationDetails appDetail : appDetails) {
			ApplicationData data = new ApplicationData();
			data.setApp_id(appDetail.getApplication_id());
			data.setStuName(appDetail.getRegistrationDetails().getStuName());
			dataList.add(data);

		}
		return dataList;
	}

	public InstituteRegistration fetchInst(String instCode, String password) throws NoUserException  {
		
			System.out.println("fetchInst() executed..");
			
			InstituteRegistration instReg;
			
				instReg = instDao.fetchInst(instCode, password);
			
				
			
			
			System.out.println("instReg : "+instReg);
		
	
		return instReg;
		
	}

	public ApplicationData fetchApplications(int app_id) {
		ApplicationDetails appDetail = instDao.fetchStudentByAppID(app_id);
		ApplicationData data = new ApplicationData();
		
		data.setStuName(appDetail.getRegistrationDetails().getStuName());
		data.setGender(appDetail.getRegistrationDetails().getGender());
		data.setDob(appDetail.getRegistrationDetails().getDob());
		data.setMobileNo(appDetail.getRegistrationDetails().getMobileNo());
		data.setDistrict(appDetail.getRegistrationDetails().getDistrict());
		data.setState(appDetail.getRegistrationDetails().getState());
		data.setEmail(appDetail.getRegistrationDetails().getEmail());
		data.setInstCode(appDetail.getRegistrationDetails().getInstCode());
		data.setAdharNo(appDetail.getRegistrationDetails().getAdharNo());
		data.setPresentClass(appDetail.getAcademicDetails().getPresentCourse());
		data.setPresentCourseYear(appDetail.getAcademicDetails().getPresentYear());
		data.setModeOfStudy(appDetail.getAcademicDetails().getModeOfStudy());
		data.setClassStartDate(appDetail.getAcademicDetails().getCourseStartDate());
		data.setUniversityBoardName(appDetail.getAcademicDetails().getBoardName());
		data.setPreviousClassCourse(appDetail.getAcademicDetails().getPreviousCourseName());
		data.setPreviousPassingYear(appDetail.getAcademicDetails().getPreviousYear());
		data.setPreviousCoursePercent(appDetail.getAcademicDetails().getPreviousYearPercent());
		data.setTenthRollNo(appDetail.getAcademicDetails().getTenthRollNum());
		data.setTenthMarksObtained(appDetail.getAcademicDetails().getTenthPercent());
		data.setTenthBoardName(appDetail.getAcademicDetails().getTenthBoardName());
		data.setTenthPassingYear(appDetail.getAcademicDetails().getTenthPassingYear());
		data.setTwelfthRollNo(appDetail.getAcademicDetails().getTenthRollNum());
		data.setTwelfthMarksObtained(appDetail.getAcademicDetails().getTwelvethPercent());
		data.setTwelfthBoardName(appDetail.getAcademicDetails().getTwelvethBoardName());
		data.setTwelfthPassingYear(appDetail.getAcademicDetails().getTwelvethPassingYear());
		/*
		 * data.setTenthMarkPath(appDetail.getDocumentUpload().getTenthMarksheet());
		 * data.setTwelvethMarkPath(appDetail.getDocumentUpload().getTwelvethMarksheet()
		 * );
		 */
		
		return data;
	}

	public void updateApplications(int id) {
		ApplicationDetails applicationDetails = instDao.fetchStudentByAppID(id);
		applicationDetails.setBonafideCertificate("approved");
		instDao.add(applicationDetails);
		
	}

}
