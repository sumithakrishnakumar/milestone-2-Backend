package com.project.memberdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.project.memberdetails.Response.ClaimsResponse;
import com.project.memberdetails.model.Claims;
import com.project.memberdetails.model.DependentClaims;
import com.project.memberdetails.service.ClaimService;

@RestController
@CrossOrigin(origins ="*")
public class ClaimController {

	
	@Autowired
	ClaimService claimService;
	
	@PostMapping("/claims")
	public ClaimsResponse claims(@RequestBody Claims claimsRequest,@RequestHeader String header){
		ClaimsResponse value=claimService.saveClaims(claimsRequest,header);
		return value; 
	}
	
	
	@PostMapping("/claimsDependent1")
	public ClaimsResponse claimsDependent1(@RequestBody DependentClaims claimsRequest,@RequestHeader String header){
		ClaimsResponse value=claimService.saveClaimsDependent1(claimsRequest,header);
		return value; 
	}
	@PostMapping("/claimsDependent2")
	public ClaimsResponse claimsDependent2(@RequestBody DependentClaims claimsRequest,@RequestHeader String header){
		ClaimsResponse value=claimService.saveClaimsDependent2(claimsRequest,header);
		return value; 
	}
	
}
