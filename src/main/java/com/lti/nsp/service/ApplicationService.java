package com.lti.nsp.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.nsp.dao.StudentDao;
import com.lti.nsp.dto.ApplicationDTO;
import com.lti.nsp.entity.AcademicDetails;
import com.lti.nsp.entity.ApplicationDetails;
import com.lti.nsp.entity.BankDetails;
import com.lti.nsp.entity.BasicDetails;
import com.lti.nsp.entity.ContactDetails;
import com.lti.nsp.entity.DocumentUpload;
import com.lti.nsp.entity.FeeDetails;
import com.lti.nsp.entity.RegistrationDetails;
import com.lti.nsp.interfaces.GenericDao;

@Service
public class ApplicationService {

	@Autowired
	StudentDao genericDao;

	public void addApplicationDetails(ApplicationDTO dto) {

		BasicDetails basDetails = new BasicDetails();
		basDetails.setReligion(dto.getReligion());
		basDetails.setCategory(dto.getCategory());
		basDetails.setFatherName(dto.getFather());
		basDetails.setMotherName(dto.getMother());
		basDetails.setAnnualIncome(dto.getIncome());
		basDetails.setParentProfession(dto.getParentProfession());

		genericDao.add(basDetails);

		AcademicDetails acaDetails = new AcademicDetails();
		acaDetails.setInstituteName(dto.getInstituteName());
		acaDetails.setPresentCourse(dto.getPresentClass());
		acaDetails.setPresentYear(dto.getPresentCourseYear());
		acaDetails.setCourseStartDate(dto.getClassStartDate());
		acaDetails.setBoardName(dto.getUniversityBoardName());
		acaDetails.setPreviousCourseName(dto.getPreviousClassCourse());
		acaDetails.setPreviousYear(dto.getPreviousPassingYear());
		acaDetails.setPreviousYearPercent(dto.getPreviousCoursePercent());
		acaDetails.setModeOfStudy(dto.getModeOfStudy());
		acaDetails.setBoardName(dto.getTenthBoardName());
		acaDetails.setTenthRollNum(dto.getTenthRollNo());
		acaDetails.setTenthBoardName(dto.getTenthBoardName());
		acaDetails.setTenthPassingYear(dto.getTenthPassingYear());
		acaDetails.setTenthPercent(dto.getTenthMarksObtained());
		acaDetails.setTwelvethRollNum(dto.getTwelfthRollNo());
		acaDetails.setTwelvethBoardName(dto.getTwelfthBoardName());
		acaDetails.setTwelvethPassingYear(dto.getTwelfthPassingYear());
		acaDetails.setTwelvethPercent(dto.getTwelfthMarksObtained());

		genericDao.add(acaDetails);

		FeeDetails feeDetails = new FeeDetails();
		feeDetails.setAdmissionFee(dto.getAdmissionFee());
		feeDetails.setTutionFee(dto.getTuitionFee());
		feeDetails.setOtherFee(dto.getOtherFee());

		genericDao.add(feeDetails);

		ContactDetails contactDetails = new ContactDetails();
		contactDetails.setState(dto.getScholarState());
		contactDetails.setDistrict(dto.getScholarDistrict());
		contactDetails.setBlock(dto.getScholarBlock());
		contactDetails.setHouseNo(dto.getHouseNo());
		contactDetails.setStreetNo(dto.getStreetNo());
		contactDetails.setPinCode(dto.getPincode());

		genericDao.add(contactDetails);

	//	RegistrationDetails student = (RegistrationDetails) genericDao.(RegistrationDetails.class, dto.getReg_id());
		//BankDetails bankDetails = (BankDetails) genericDao.fetchStudentByID(BankDetails.class,
		
		RegistrationDetails student = (RegistrationDetails) genericDao.fetchAll();
		
		
		student.getBankDetails().getBank_id();

		DocumentUpload docUpload = new DocumentUpload();
		docUpload = (DocumentUpload) genericDao.add(docUpload);
		int docId = docUpload.getDocs_id();
		String path = "D:/Scholar-Boat/uploads/" + docId;
		new File(path).mkdirs();
		
		String aadharPath = dto.getAadharCard().getOriginalFilename();

		String bankPassbookPath = dto.getBankPassbook().getOriginalFilename();
		String currFeeRecieptPath = dto.getCurrReciept().getOriginalFilename();
		String domicileCertiPath = dto.getDomicileCertificate().getOriginalFilename();
		String incomeCertiPath = dto.getIncomeCertificate().getOriginalFilename();
		String instCardPath = dto.getInstIdCard().getOriginalFilename();
		String preYearMarksheetPath = dto.getPrevMarksheet().getOriginalFilename();
		String studentPhotoPath = dto.getStuPhoto().getOriginalFilename();
		String tenthMarksheetPath = dto.getTenthMarksheet().getOriginalFilename();
		String twelvethMarksheetPath = dto.getTwelvethMarksheet().getOriginalFilename();

		try {
			dto.getAadharCard().transferTo(new File(path + "/" + aadharPath));

			dto.getBankPassbook().transferTo(new File(path + "/" + bankPassbookPath));
			dto.getCurrReciept().transferTo(new File(path + "/" + currFeeRecieptPath));
			dto.getDomicileCertificate().transferTo(new File(path + "/" + domicileCertiPath));
			dto.getIncomeCertificate().transferTo(new File(path + "/" + incomeCertiPath));
			dto.getInstIdCard().transferTo(new File(path + "/" + instCardPath));
			dto.getPrevMarksheet().transferTo(new File(path + "/" + preYearMarksheetPath));
			dto.getStuPhoto().transferTo(new File(path + "/" + studentPhotoPath));
			dto.getTenthMarksheet().transferTo(new File(path + "/" + tenthMarksheetPath));
			dto.getTwelvethMarksheet().transferTo(new File(path + "/" + twelvethMarksheetPath));

		} catch (IOException e) {
			e.printStackTrace();
		}

		  docUpload.setAadharCard(path + "/" + aadharPath);
		  docUpload.setBankPassbook(path + "/" + bankPassbookPath);
		  docUpload.setCurrFeeReciept(path + "/" + domicileCertiPath);
		  docUpload.setDomicileCertificate(path + "/" + incomeCertiPath);
		  docUpload.setIncomeCertificate(path + "/" + instCardPath);
		  docUpload.setInstIdCard(path + "/" + preYearMarksheetPath);
		  docUpload.setPreYearMarksheet(path + "/" + studentPhotoPath);
		  docUpload.setStudentPhoto(path + "/" + studentPhotoPath);
		  docUpload.setTenthMarksheet(path + "/" + tenthMarksheetPath);
		  docUpload.setTwelvethMarksheet(path + "/" + twelvethMarksheetPath);
		 

		genericDao.add(docUpload);

		ApplicationDetails appDetails = new ApplicationDetails();
		appDetails.setDocumentUpload(docUpload);
		appDetails.setRegistrationDetails(student);
		BankDetails bankDetails=student.getBankDetails();
		appDetails.setBankDetails(bankDetails);
		appDetails.setAcademicDetails(acaDetails);
		appDetails.setBasicDetails(basDetails);
		appDetails.setContactDetails(contactDetails);
		appDetails.setFeeDetails(feeDetails);
		appDetails.setScholarshipDetails("Something about Scholarship");
		appDetails.setScholarshipScheme("PaisaLootScheme");
		appDetails.setBonafideCertificate("on-process");
		appDetails.setStatus("on-process");
		genericDao.add(appDetails);
	}

}
