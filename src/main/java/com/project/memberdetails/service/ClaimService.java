package com.project.memberdetails.service;

import com.project.memberdetails.Response.ClaimsResponse;
import com.project.memberdetails.model.Claims;
import com.project.memberdetails.model.DependentClaims;

public interface ClaimService {

	ClaimsResponse saveClaims(Claims claimsRequest, String memberId);

	ClaimsResponse saveClaimsDependent1(DependentClaims claimsRequest, String memberId);

	ClaimsResponse saveClaimsDependent2(DependentClaims claimsRequest, String memberId);




}  
     