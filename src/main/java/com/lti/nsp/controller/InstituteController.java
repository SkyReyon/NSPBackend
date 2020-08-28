package com.lti.nsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.nsp.dto.ApplicationData;
import com.lti.nsp.dto.InstRegistrationDTO;
import com.lti.nsp.dto.LoginDTO;
import com.lti.nsp.entity.InstituteRegistration;
import com.lti.nsp.exception.NoUserException;
import com.lti.nsp.service.InstituteService;
import com.lti.nsp.dto.InstRegistrationDTO;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class InstituteController {
	@Autowired
	private InstituteService instituteService;
	
	public InstituteController () {
		System.out.println("InstituteController() ctor...");
	}
	
	@RequestMapping(path="/registerInst", method=RequestMethod.POST)
	public String register(@RequestBody InstRegistrationDTO dto) {
		System.out.println(dto.getInstCity());
		instituteService.addInstDetails(dto);
		return "Registered";
		
	}
	
	@RequestMapping(value="/institute-authenticate", method=RequestMethod.POST)
	public String instituteAuthenticate(@RequestBody LoginDTO dto) {
		String message=null;
		try {
			
		
		
		System.out.println("instituteAuthenticate()==>"+dto.getInstCode());
		
			InstituteRegistration regDetails= instituteService.fetchInst(dto.getInstCode(), dto.getPassword()); 
			System.out.println("IDHAR TAK NAHI AA RAHA HAI : Value is :"+regDetails.getInstCode());
			
			message=regDetails.getInstCode();
		}
		catch(NoUserException e)
		{
			message=e.getMessage();
		}
		return message;
		
		
	}
	
	@RequestMapping(path="/institute-login", method=RequestMethod.POST)
	public List<ApplicationData> instituteLogin(@RequestBody LoginDTO dto) {
		List<ApplicationData> dataList= instituteService.fetchAllApplications(dto.getInstCode()); 
		return dataList;
		
	}
	
	@RequestMapping(path="/institute-applications", method=RequestMethod.POST)
	public ApplicationData instituteAppData(@RequestBody LoginDTO dto) {
		ApplicationData dataList= instituteService.fetchApplications(dto.getId()); 
		
		
		//  System.out.println(dataList.getGender());
		  //System.out.println(dataList.getEmail());
		  //System.out.println(dataList.getTenthMarkPath());
		 
	return dataList;
		
	}
	
	@RequestMapping(path="/institute-approve", method=RequestMethod.POST)
	public String instituteApprove(@RequestBody LoginDTO dto) {
		instituteService.updateApplications(dto.getId());
		
		return "approved";
	}




}

/*
  	@Autowired
	private InstituteService instituteService;
	
	@RequestMapping(path="/registerInst", method=RequestMethod.POST)
	public String register(@RequestBody InstRegistrationDTO dto) {
		System.out.println(dto.getInstCity());
		instituteService.addInstDetails(dto);
		return "Registered";
		
	}
	
	@RequestMapping(path="/institute-authenticate", method=RequestMethod.GET)
	public String instituteAuthenticate(@RequestBody LoginDTO dto) {
		try {
			InstituteRegistration regDetails= instituteService.fetchInst(dto.getInstCode(), dto.getPassword()); 
			return regDetails.getInstCode();
			//return "Success";
		}
		catch(NoUserException e) {
			return null;
			//return "Failure";
		}
		
	}
	
	@RequestMapping(path="/institute-login", method=RequestMethod.POST)
	public List<ApplicationData> instituteLogin(@RequestBody LoginDTO dto) {
		List<ApplicationData> dataList= instituteService.fetchAllApplications(dto.getInstCode()); 
		return dataList;
		
	}
	
	@RequestMapping(path="/institute-applications", method=RequestMethod.POST)
	public ApplicationData instituteAppData(@RequestBody LoginDTO dto) {
		ApplicationData dataList= instituteService.fetchApplications(dto.getId()); 
		
		
		//  System.out.println(dataList.getGender());
		  //System.out.println(dataList.getEmail());
		  //System.out.println(dataList.getTenthMarkPath());
		 
	return dataList;
		
	}
	
	@RequestMapping(path="/institute-approve", method=RequestMethod.POST)
	public String instituteApprove(@RequestBody LoginDTO dto) {
		instituteService.updateApplications(dto.getId());
		
		return "approved";
	}*/
