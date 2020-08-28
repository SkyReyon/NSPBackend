package com.lti.nsp.dao;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import com.lti.nsp.entity.ApplicationDetails;
import com.lti.nsp.entity.InstituteRegistration;
import com.lti.nsp.entity.NodalOfficer;
import com.lti.nsp.entity.RegistrationDetails;
import com.lti.nsp.exception.NoUserException;

@Repository
public class NodalDao extends GenericDaoImpl {
	
	

	public NodalOfficer fetchNodal(String userName, String password) throws NoUserException {
		System.out.println("DAO : fetchInst() ");
		System.out.println(userName);
		System.out.println(password);
		NodalOfficer  nod    = (NodalOfficer)entityManager
										.createQuery("from NodalOfficer where userName =:userName and password =:password")
										.setParameter("userName", userName)
										.setParameter("password", password)
										.getSingleResult();
		
		if(nod==null) {
			throw new NoUserException("No user Found");
		
		}
		else {
			return nod;
		}

	
	}

	public List<ApplicationDetails> fetchStudents() {
		List<ApplicationDetails> details = (List<ApplicationDetails>) entityManager
				.createQuery("select application from ApplicationDetails as application where application.bonafideCertificate = :bc and application.status= :status")
				.setParameter("bc", "approved")
				.setParameter("status", "on-process")
				.getResultList();
		return details;
		
	}

	public List<InstituteRegistration> fetchInstitutes() {
		List<InstituteRegistration> details = (List<InstituteRegistration>) entityManager
				.createQuery("select institute from InstituteRegistration as institute where institute.status = :status")
				.setParameter("status", "on-process")
				.getResultList();

		return details;
	}

	public ApplicationDetails fetchStudentByAppID(int appId) {

		ApplicationDetails appDetail = entityManager.find(ApplicationDetails.class, appId);
		return appDetail;
	}
	
	public InstituteRegistration fetchInstitute(String instCode) {
		InstituteRegistration institute = (InstituteRegistration)entityManager.createQuery("select institute from InstituteRegistration as institute where institute.instCode= :instCode").setParameter("instCode",instCode).getSingleResult();
		return institute;
	}

}
