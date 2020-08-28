package com.lti.nsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.nsp.dto.ApplicationData;
import com.lti.nsp.dto.InstituteData;
import com.lti.nsp.dto.LoginDTO;
import com.lti.nsp.dto.NodalDTO;
import com.lti.nsp.entity.InstituteRegistration;
import com.lti.nsp.entity.NodalOfficer;
import com.lti.nsp.exception.NoUserException;
import com.lti.nsp.service.NodalService;

@RestController    
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NodalController {

	@Autowired
	private NodalService nodalService;
	
	@RequestMapping(path="/nodal-authenticate", method=RequestMethod.POST)
	public String nodalAuthenticate(@RequestBody LoginDTO dto) {
		String message=null;
		try {
			System.out.println(dto.getUserName());
			
			NodalOfficer nod= nodalService.fetchNodal(dto.getUserName(), dto.getPassword()); 
		
			
			message=nod.getUserName();
		}
		catch(NoUserException e)
		{
			message=e.getMessage();
		}
		return message;
		
		
	}
	
	@RequestMapping(path="/nodal-login", method=RequestMethod.POST)
	public NodalDTO nodalLogin() {
		NodalDTO dto = new NodalDTO();
		List<ApplicationData> dataList;
		List<InstituteData> instituteList;
		try {
			dataList= nodalService.fetchAllStudents(); 
		}
		catch(IndexOutOfBoundsException e){
			dto.setStudentData("No data found!");
			dataList= null;
		}
		try {
			instituteList = nodalService.fetchAllInstitute();
		}		
		catch(IndexOutOfBoundsException e) {
			dto.setInstituteData("No data found!");
			instituteList= null;
		}
		dto.setInstitutes(instituteList);
		dto.setStudents(dataList);
		return dto;
	}
	
	@RequestMapping(path="/nodal-stuApplications", method=RequestMethod.POST)
	public ApplicationData studentAppData(@RequestBody LoginDTO dto) {
		ApplicationData dataList= nodalService.fetchApplications(dto.getId()); 
		
		return dataList;
		
	}
	
	@RequestMapping(path="/nodal-instituteApplications", method=RequestMethod.POST)
	public InstituteRegistration instAppData(@RequestBody LoginDTO dto) {
		InstituteRegistration dataList= nodalService.fetchInstitute(dto.getInstCode()); 
		return dataList;
		
	}
	@RequestMapping(path="/nodal-stuOperation", method=RequestMethod.POST)
	public String studentOperation(@RequestBody LoginDTO dto) {
		nodalService.updateApplications(dto.getId(),dto.getOperation());
		return dto.getOperation();
	}
	@RequestMapping(path="/nodal-instituteOperation", method=RequestMethod.POST)
	public String instituteOperation(@RequestBody LoginDTO dto) {
		nodalService.updateInstApplications(dto.getInstCode(),dto.getOperation());
		return dto.getOperation();
	}
	
}
