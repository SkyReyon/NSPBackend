package com.lti.nsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.nsp.dto.ApplicationDTO;
import com.lti.nsp.dto.RegistrationDTO;
import com.lti.nsp.service.ApplicationService;
import com.lti.nsp.service.RegistrationService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ApplicationController {

	@Autowired
	private ApplicationService applicationService;
	
	@RequestMapping(path="/application")
	public String register(ApplicationDTO dto) {
		applicationService.addApplicationDetails(dto); 
		return "success";
		
	}
}
