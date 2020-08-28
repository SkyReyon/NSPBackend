package com.lti.nsp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.nsp.dao.NodalDao;
import com.lti.nsp.dto.ApplicationData;
import com.lti.nsp.dto.InstituteData;
import com.lti.nsp.entity.ApplicationDetails;
import com.lti.nsp.entity.InstituteRegistration;
import com.lti.nsp.entity.NodalOfficer;
import com.lti.nsp.exception.NoUserException;

@Service
public class NodalService {

	@Autowired
	private NodalDao nodalDao;
	
	public NodalOfficer fetchNodal(String userName, String password) throws NoUserException {
		System.out.println("fetchInst() executed..");
		
		NodalOfficer nod;
		
			nod = nodalDao.fetchNodal(userName, password);
		
			
		
		
		System.out.println("instReg : "+nod);
	

	return nod;
	
	
	}
public List<ApplicationData> fetchAllStudents() throws IndexOutOfBoundsException {
		
		List<ApplicationDetails> appDetails = nodalDao.fetchStudents();
		List<ApplicationData> dataList = new ArrayList<ApplicationData>();

		for (ApplicationDetails appDetail : appDetails) {
			ApplicationData data = new ApplicationData();
			data.setApp_id(appDetail.getApplication_id());
			data.setStuName(appDetail.getRegistrationDetails().getStuName());
			dataList.add(data);

		}
		return dataList;
	}

	
	public ApplicationData fetchApplications(int app_id) {
		ApplicationDetails appDetail = nodalDao.fetchStudentByAppID(app_id);
		ApplicationData data = new ApplicationData();
		
		data.setStuName(appDetail.getRegistrationDetails().getStuName());
		data.setDistrict(appDetail.getRegistrationDetails().getDistrict());
		data.setAdharNo(appDetail.getRegistrationDetails().getAdharNo());
		data.setInstCode(appDetail.getRegistrationDetails().getInstCode());
		data.setInstituteName(appDetail.getAcademicDetails().getInstituteName());
		data.setPresentClass(appDetail.getAcademicDetails().getPresentCourse());
		data.setUniversityBoardName(appDetail.getAcademicDetails().getBoardName());
		data.setTenthMarksObtained(appDetail.getAcademicDetails().getTenthPercent());
		data.setTwelfthMarksObtained(appDetail.getAcademicDetails().getTwelvethPercent());
		data.setAdmissionFee(appDetail.getFeeDetails().getAdmissionFee());
		data.setTuitionFee(appDetail.getFeeDetails().getTutionFee());
		data.setScheme(appDetail.getScholarshipScheme());
		
		return data;
	}
	
	public List<InstituteData> fetchAllInstitute() {
		List<InstituteRegistration> institutes = nodalDao.fetchInstitutes();
		List<InstituteData> dataList = new ArrayList<InstituteData>();
		
		for(InstituteRegistration institute : institutes) {
			InstituteData data = new InstituteData();
			data.setInstCode(institute.getInstCode());
			data.setInstitueName(institute.getInstName());
			dataList.add(data);
		}
		
		return dataList;
	}
	
	public InstituteRegistration fetchInstitute(String instCode){
		return nodalDao.fetchInstitute(instCode);
	}
	public void updateApplications(int id , String operation) {
		ApplicationDetails applicationDetails = nodalDao.fetchStudentByAppID(id);
		applicationDetails.setStatus(operation);
		nodalDao.add(applicationDetails);
	}
	public void updateInstApplications(String instCode , String operation) {
		InstituteRegistration institute= nodalDao.fetchInstitute(instCode);
		institute.setStatus(operation);
		nodalDao.add(institute);
	}
	
}
