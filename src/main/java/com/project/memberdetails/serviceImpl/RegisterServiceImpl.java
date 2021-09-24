package com.project.memberdetails.serviceImpl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.memberdetails.Response.RegisterResponse;
import com.project.memberdetails.dao.RegisterDao;
import com.project.memberdetails.model.Register;
import com.project.memberdetails.service.RegisterService;
import com.project.memberdetails.validator.RegisterValidator;
@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	RegisterDao registerDao;
	
	
	@Override
	public RegisterResponse registerDetails(Register registerRequest) {
//		RegisterValidator validator=new RegisterValidator();
//		validator.validateRegister(registerRequest);
		RegisterResponse response=new RegisterResponse();
		Register email=registerDao.getRegisteruser(registerRequest.getMemberEmail());
		if(email!=null) {
			response.setError("Email already exist");
			return response;
		}
		String id=randomMemberID();
		registerRequest.setMemberId(id);
		 String message=registerDao.saveDetails(registerRequest);
		 response.setMessage("Member Id R-"+id+message);
		 response.setListData(registerRequest);
		 
		return response;
	}
	
	public static String randomMemberID() {
		 Random r = new Random();
		 String id=null;
		    String s = r.ints(48, 123)
		                .filter(num -> (num < 58 || num > 64) && (num < 91 || num > 96))
		    .limit(3) 
		    .mapToObj(c -> (char) c).collect(StringBuffer::new, StringBuffer::append, StringBuffer::append)
		          .toString();
		    System.out.println("Random alphanumeric string is: " + s);
		    id="R- "+s;
			return id;
		  }

}
