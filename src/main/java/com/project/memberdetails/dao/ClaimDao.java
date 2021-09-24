package com.project.memberdetails.dao;

import com.project.memberdetails.model.Claims;

public interface ClaimDao {

	String saveClaimDetails(Claims claimsRequest);

	Claims getdata(Long claimId);

	Claims getclaimsdata(String memberId);

	String saveClaimDependentDetails(Claims dependent, Long long1);
 
	Claims getdependentData(String memberId); 

}  
   