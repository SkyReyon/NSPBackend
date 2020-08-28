package com.lti.nsp.springnsp;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.lti.nsp.dao.ApplicationDao;
import com.lti.nsp.dao.InstituteDao;
import com.lti.nsp.dao.NodalDao;
import com.lti.nsp.dao.StudentDao;
import com.lti.nsp.dao.StudentDetails;
import com.lti.nsp.entity.AcademicDetails;
import com.lti.nsp.entity.ApplicationDetails;
import com.lti.nsp.entity.BankDetails;
import com.lti.nsp.entity.BasicDetails;
import com.lti.nsp.entity.ContactDetails;
import com.lti.nsp.entity.Disability;
import com.lti.nsp.entity.FeeDetails;
import com.lti.nsp.entity.InstituteRegistration;
import com.lti.nsp.entity.NodalOfficer;
import com.lti.nsp.entity.RegistrationDetails;
import com.lti.nsp.exception.NoUserException;
import com.lti.nsp.interfaces.GenericDao;

@RunWith(SpringRunner.class)
@DataJpaTest
@Rollback(false)
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class SpringNspApplicationTests {

	@Autowired
	StudentDao genDao;

	@Autowired
	ApplicationDao appDao;
	
	@Autowired
	InstituteDao instDao;
	
	@Test
	public void studentRegistrationTest() {

		
		BankDetails bankDetails = new BankDetails();
        bankDetails.setAcno("32134322");
		bankDetails.setBankName("Bankrupt Bank");
		bankDetails.setIfsc("IFSCNAHIHAI000");

		genDao.add(bankDetails);
		
		
		
		RegistrationDetails reg = new RegistrationDetails();
		reg.setStuName("Rima");
		reg.setGender("Female");
		reg.setDob("14/12/1998");
		reg.setMobileNo("123456788");
		reg.setDistrict("Singrauli");
		reg.setState("singrauli");
		reg.setEmail("r@gmail.com");
		reg.setInstCode("IN2390898");
		reg.setAdharNo("1234567890");
		reg.setPassword("123456");
		reg.setBankDetails(bankDetails);

		/* System.out.println("Inserting"); */
		genDao.add(reg);

		BasicDetails bd = new BasicDetails();
		bd.setAnnualIncome("300000");
		bd.setCategory("General");
		bd.setFatherName("Gadbad Singh");
		bd.setMotherName("Pinky Devi");
		bd.setParentProfession("Error Maker");
		bd.setReligion("Debugger");

		genDao.add(bd);

		

		ContactDetails contactDetails = new ContactDetails();
	    contactDetails.setStreetNo("4");
	    contactDetails.setHouseNo("52");
		contactDetails.setBlock("Gurvinder singh ");
		contactDetails.setDistrict("Jodhpur");
		contactDetails.setState("Jodhpur");
		contactDetails.setPinCode("342001");

		genDao.add(contactDetails);

		FeeDetails feeDetails = new FeeDetails();
		feeDetails.setAdmissionFee("40000");
		feeDetails.setTutionFee("30000");
		feeDetails.setOtherFee("100000");

		genDao.add(feeDetails);

		
		  AcademicDetails academicDetails = new AcademicDetails();
		  academicDetails.setBoardName("CBSE");
		  academicDetails.setCourseStartDate("21/04/2014");
		  academicDetails.setInstituteName("Pinky International School");
		  academicDetails.setModeOfStudy("Regular");
		  academicDetails.setPresentCourse("12th");
		  academicDetails.setPresentYear("2019");
		  academicDetails.setPreviousCourseName("Obviously 11th");
		  academicDetails.setPreviousYearPercent("85");
		  academicDetails.setPreviousYear("2018");
		  academicDetails.setTenthBoardName("RBSE");
		  academicDetails.setTenthPassingYear("2012");
		  academicDetails.setTenthPercent("80.02");
		  academicDetails.setTenthRollNum("1212");
		  academicDetails.setTwelvethBoardName("CBSE");
		  academicDetails.setTwelvethPassingYear("2014");
		  academicDetails.setTwelvethPercent("81.11");
		  academicDetails.setTwelvethRollNum("112211");
		 
		// If you can still see the working code which means coder is still alive....

	    genDao.add(academicDetails);
	    
	    Disability dis=new Disability();
        
	    dis.setDisabilityName("nothing");
	    dis.setPercentageOfDisability(82.0);
	    dis.setTypeOfDisability("nothing");
	    
	    
	    
	    genDao.add(dis);
	    
	    
		ApplicationDetails applicationDetails = new ApplicationDetails();

		applicationDetails.setAcademicDetails(academicDetails);
		applicationDetails.setBankDetails(bankDetails);
		applicationDetails.setBasicDetails(bd);
		applicationDetails.setContactDetails(contactDetails);
		applicationDetails.setFeeDetails(feeDetails);
		applicationDetails.setRegistrationDetails(reg);
		applicationDetails.setDisability(dis);
		applicationDetails.setScholarshipDetails("details mentioned");
		applicationDetails.setScholarshipScheme("scholarship portal");
		applicationDetails.setStatus("in-process");

		genDao.add(applicationDetails);
	}

	@Test
	public void fetchStudents() {

		List<RegistrationDetails> students = genDao.fetchAll();
		for (RegistrationDetails student : students) {
			System.out.println("Registration ID : " + student.getReg_id());
			System.out.println("Registration name : " + student.getStuName());
		}
	}
	

	@Test
	public void check() {
		//StudentDetails details = appDao.fetchAllDetails("1233445643");
		//System.out.println(details.getApp_id());
		//System.out.println(details.getName());
		//System.out.println(details.getEmail());
	}




	@Test
	public void addInsRegtest() {
		
		 InstituteRegistration reg = new InstituteRegistration();
		  reg.setAffState("Mumbai"); 
		  reg.setInstName("Abc"); 
		  reg.setInstCode("I001");
		  reg.setDiseCode("e22"); 
		  reg.setInstState("Mumbai"); 
		  reg.setPassword("2234ui");
		
		  
		 genDao.add(reg);
		 

	}
	@Test
	public void fetchAllInst() {

		
		  List<InstituteRegistration> inst = instDao.fetchAllInst(); for
		  (InstituteRegistration insti : inst) { System.out.println("Inst Code: " +
		  insti.getInstCode()); System.out.println("Inst Code: " +
		  insti.getInstCode()); }
		 
	}
	
	@Test
	public void fetchSingleInst()
	{
		//InstituteRegistration is;
		//try {
			//is = instDao.fetchInst("101","asd" );
		//} catch (NoUserException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		//System.out.println("instCode"+is);
		
	}
	
	
	@Autowired
	NodalDao nodalDao;
	
	@Test
	public void nodalOfficerTest() {

		NodalOfficer reg = new NodalOfficer();
		reg.setUserName("Akash");
		reg.setPassword("male");
		reg.setName("Singraul");
		
		
		
		nodalDao.add(reg);

	
	
	}

}