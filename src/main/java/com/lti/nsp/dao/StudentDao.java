package com.lti.nsp.dao;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import com.lti.nsp.dto.ApplicationDTO;
import com.lti.nsp.entity.ApplicationDetails;
import com.lti.nsp.entity.InstituteRegistration;
import com.lti.nsp.entity.RegistrationDetails;
import com.lti.nsp.exception.NoUserException;

@Repository
public class StudentDao extends GenericDaoImpl {

	public List<RegistrationDetails> fetchAll() {
		List<RegistrationDetails> studentList = entityManager.createQuery("SELECT regDetails from RegistrationDetails as regDetails").getResultList();
		return studentList;
	}
	
/*	public Object fetchStudentByID(Class classname,int id) {
		Object student = entityManager.find(classname, id);
		return student;
	}
	*/
	
	public RegistrationDetails fetchStudentByID(String adharNo,String password) throws NoUserException
	{
		RegistrationDetails regdet=null;
		try {
		System.out.println("DAO : fetchInst() ");
		System.out.println(adharNo);
		System.out.println(password);
		                       regdet = (RegistrationDetails)entityManager
										.createQuery("from RegistrationDetails where adharNo =:adharNo and password =:password")
										.setParameter("adharNo",adharNo)
										.setParameter("password", password)
										.getSingleResult();
		    
		
		
			
		
		}
		catch(Exception e) {
			throw new NoUserException("No user Found");
		}
			return regdet;
		

		
		
		
		
	}
	public RegistrationDetails fetchStudent(String aadhar,String password) throws NoUserException {
		
		
			RegistrationDetails student = (RegistrationDetails)entityManager
		
										.createQuery("select student from RegistrationDetails as student where student.adharNo= :aadhar and student.password= :password")
										.setParameter("aadhar", aadhar)
										.setParameter("password", password)
										.getSingleResult();
		
		
			if(student==null) {
				throw new NoUserException("No user Found");
			
			}
			else {
				return student;
			}
		
	}
}
