package com.project.memberdetails.serviceImpl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.memberdetails.Response.ClaimsResponse;
import com.project.memberdetails.dao.ClaimDao;
import com.project.memberdetails.model.Claims;
import com.project.memberdetails.model.DependentClaims;
import com.project.memberdetails.service.ClaimService;

@Service
public class ClaimServiceImpl implements ClaimService {

	
	@Autowired
	ClaimDao claimDao;
	
	@Override
	public ClaimsResponse saveClaims(Claims claimsRequest,String memberId) {
		ClaimsResponse response=new ClaimsResponse();
		long value=getRandomNumberString(10);
		claimsRequest.setClaimId(value); 
		claimsRequest.setMemberId(memberId);
		 String message=claimDao.saveClaimDetails(claimsRequest);
		 Claims data=claimDao.getdata(claimsRequest.getClaimId());
		 response.setSuccessMessage(message);
		 response.setData(data);
		return response;
	}
	public static long getRandomNumberString(int length) {
		
		Random random = new Random();
	    char[] digits = new char[length];
	    digits[0] = (char) (random.nextInt(9) + '1');
	    for (int i = 1; i < length; i++) {
	        digits[i] = (char) (random.nextInt(10) + '0');
	    }
	    Long value= Long.parseLong(new String(digits));
	    return value;
	}
	@Override
	public ClaimsResponse saveClaimsDependent1(DependentClaims claimsRequest, String memberId) {
		Claims dependent=claimDao.getclaimsdata(memberId);
		ClaimsResponse response=new ClaimsResponse();
		long value=getRandomNumberString(10);
		claimsRequest.setDependentclaimId(value);
		dependent.setDependent1Claims(claimsRequest);
		 String message=claimDao.saveClaimDependentDetails(dependent,claimsRequest.getDependentclaimId());
		 Claims data=claimDao.getdependentData(memberId);
		 response.setListData(data.getDependent1Claims());
		 response.setSuccessMessage(message);
		return response;
	}
	@Override
	public ClaimsResponse saveClaimsDependent2(DependentClaims claimsRequest, String memberId) {
		Claims dependent=claimDao.getclaimsdata(memberId);
		ClaimsResponse response=new ClaimsResponse();
		long value=getRandomNumberString(10);
		claimsRequest.setDependentclaimId(value);
		dependent.setDependent2Claims(claimsRequest);
		 String message=claimDao.saveClaimDependentDetails(dependent,claimsRequest.getDependentclaimId());
		 Claims data=claimDao.getdependentData(memberId);
		 response.setListData(data.getDependent2Claims()
				 );
		 response.setSuccessMessage(message);
		return response;
	} 
}
