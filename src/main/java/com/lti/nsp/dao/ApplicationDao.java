package com.lti.nsp.dao;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.nsp.dto.ApplicationDTO;
import com.lti.nsp.entity.ApplicationDetails;
import com.lti.nsp.entity.RegistrationDetails;

@Repository
public class ApplicationDao extends GenericDaoImpl{

	public StudentDetails fetchAllDetails(String aadhar) {
		
		int id=0;
		
		Query query = entityManager
				.createQuery("SELECT student from RegistrationDetails as student where student.adharNo= :aadhar")
				.setParameter("aadhar", aadhar);
		RegistrationDetails student = (RegistrationDetails)query.getSingleResult();
		id= student.getReg_id();
		
		query = entityManager
				.createQuery("SELECT application from ApplicationDetails as application where application.registrationDetails.reg_id = :id")
				.setParameter("id", id);
		ApplicationDetails appDetails = (ApplicationDetails)query.getSingleResult();
		
		StudentDetails stuDetails = new StudentDetails();
		stuDetails.setApp_id(appDetails.getApplication_id());
		stuDetails.setName(student.getStuName());
		stuDetails.setEmail(student.getEmail());
		return stuDetails;
	}
}
