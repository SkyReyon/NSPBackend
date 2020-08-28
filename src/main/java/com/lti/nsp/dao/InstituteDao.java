package com.lti.nsp.dao;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import com.lti.nsp.entity.ApplicationDetails;
import com.lti.nsp.entity.InstituteRegistration;
import com.lti.nsp.exception.NoUserException;

@Repository
public class InstituteDao extends GenericDaoImpl{

	public List<InstituteRegistration> fetchAllInst() {
		List<InstituteRegistration> studentList = entityManager.createQuery("SELECT instRegDetails from InstituteRegistration as instRegDetails").getResultList();
		return studentList;
	}
	
	public List<ApplicationDetails> fetchInstituteStudents(String instiCode) {
		
		List<ApplicationDetails> appList = (List<ApplicationDetails>) entityManager
				.createQuery("SELECT appDetails from ApplicationDetails as appDetails where appDetails.registrationDetails.instCode= :instiCode and appDetails.bonafideCertificate= :bc")
				.setParameter("instiCode", instiCode) 
				.setParameter("bc", "on-process")
				.getResultList();
		
		return appList;
	}
	public InstituteRegistration fetchInst(String instCode,String password) throws NoUserException {
		
			System.out.println("DAO : fetchInst() ");
		InstituteRegistration inst = (InstituteRegistration)entityManager
										.createQuery("select inst from InstituteRegistration as inst where inst.instCode= :instCode and inst.password= :password")
										.setParameter("instCode", instCode)
										.setParameter("password", password)
										.getSingleResult();
		
		if(inst==null) {
			throw new NoUserException("No user Found");
		
		}
		else {
			return inst;
		}

		
	
		// now what u want to return from this service layer to angular 
	}
	
	public ApplicationDetails fetchStudentByAppID(int appId) {
		ApplicationDetails appDetail = entityManager.find(ApplicationDetails.class, appId);
		return appDetail;
	}
}
