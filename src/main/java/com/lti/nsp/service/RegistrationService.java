package com.lti.nsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.nsp.dao.StudentDao;
import com.lti.nsp.dto.RegistrationDTO;
import com.lti.nsp.entity.BankDetails;
import com.lti.nsp.entity.RegistrationDetails;
import com.lti.nsp.exception.NoUserException;
import com.lti.nsp.interfaces.GenericDao;

@Service
public class RegistrationService {
	
	@Autowired
	StudentDao studentsDao;
	
	public void addRegistrationDetails(RegistrationDTO dto ) {
	
		RegistrationDetails regdetails = new RegistrationDetails();
		
		regdetails.setStuName(dto.getName());
		regdetails.setGender(dto.getGender());
		regdetails.setDob(dto.getDob());
		regdetails.setMobileNo(dto.getMobileNo());
		regdetails.setDistrict(dto.getDistrict());
		regdetails.setState(dto.getState());
		regdetails.setEmail(dto.getEmail());
		regdetails.setInstCode(dto.getInstiCode());
		regdetails.setAdharNo(dto.getAadharNo());
		regdetails.setPassword(dto.getPassword());
		
		
		
		BankDetails bankDetails = new BankDetails();
		bankDetails.setAcno(dto.getAccountNo());
		bankDetails.setBankName(dto.getBankName());
		bankDetails.setIfsc(dto.getBankIFSC());
		
		studentsDao.add(bankDetails);
		regdetails.setBankDetails(bankDetails);
		studentsDao.add(regdetails);
	}
	
	public RegistrationDetails fetchStudent(String adharNo , String password) throws NoUserException{
		//return studentsDao.fetchStudent(aadhar, password);
	//}
	
	//public List<RegistrationDetails> fetchAllStudents(){
		//return studentsDao.fetchAll();
		RegistrationDetails regdet;
		regdet=studentsDao.fetchStudentByID(adharNo, password);
		return regdet;
		
	}
}
