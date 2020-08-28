

package com.lti.nsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.nsp.dao.StudentDetails;
import com.lti.nsp.dto.ApplicationData;
import com.lti.nsp.dto.LoginDTO;
import com.lti.nsp.dto.RegistrationDTO;
import com.lti.nsp.entity.InstituteRegistration;
import com.lti.nsp.entity.RegistrationDetails;
import com.lti.nsp.exception.NoUserException;
import com.lti.nsp.service.InstituteService;
import com.lti.nsp.service.RegistrationService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StudentController {

	@Autowired
	private RegistrationService registrationService;
	
	

	
	@RequestMapping(path="/register", method=RequestMethod.POST)
	public String register(@RequestBody RegistrationDTO dto) {
		
		registrationService.addRegistrationDetails(dto);
		return "Success";
		
		
	}
	
	@RequestMapping(path="/studentlogin", method=RequestMethod.POST)
	public String studentAuthenticate(@RequestBody RegistrationDTO dto) {
		String message=null;
		
		
		try{
			RegistrationDetails regDetails= registrationService.fetchStudent(dto.getAadharNo(), dto.getPassword()); 
			message=regDetails.getAdharNo();
			}
		catch(NoUserException e)
		{
			message=e.getMessage();
		}
		return message;
		
	}
}
