package com.project.memberdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.project.memberdetails.Response.DependentResponse;
import com.project.memberdetails.model.Dependent;
import com.project.memberdetails.service.DependentService;

@RestController
@CrossOrigin(origins ="*")
public class DependentController {

	@Autowired
	DependentService dependentService;
	
	@PostMapping("/dependents")
	public DependentResponse dependent1(@RequestBody Dependent request,@RequestHeader String header){
		DependentResponse response=dependentService.saveDependent(request,header);
		
		return response;
		
	}
	
	
	@PostMapping("/dependent2")
	public DependentResponse dependent2(@RequestBody Dependent request,@RequestHeader String header){
		DependentResponse response=dependentService.saveDependent2(request,header);
		
		return response;
		
	}
	
	@GetMapping("/getdependent1")
	public DependentResponse getdependent1(@RequestHeader String header){
		DependentResponse response=dependentService.getList(header);
		
		return response;
		
	}
	@GetMapping("/getdependent2")
	public DependentResponse getdependent2(@RequestHeader String header){
		DependentResponse response=dependentService.getListdata(header);
		
		return response;
		
	}

	@PostMapping("/editdata")
	public DependentResponse editdependent1(@RequestHeader String header,@RequestBody Dependent request){
		DependentResponse response=dependentService.edit(header,request);
		
		
		
		return response;
		
	}
	
}
