package com.project.memberdetails.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.memberdetails.Response.RegisterResponse;
import com.project.memberdetails.dao.LoginDao;
import com.project.memberdetails.model.Login;
import com.project.memberdetails.model.Register;
import com.project.memberdetails.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao loginDao;
	
	@Override
	public RegisterResponse getLogin(Login loginRequest) {
		RegisterResponse response=new RegisterResponse();
		Register data=loginDao.getlogindata(loginRequest);
		if(data==null) {
			response.setError("Invalid UserEmail/Password");
		}else {
		response.setMessage(data.getMemberId()+" Login SuccessFull");
		response.setListData(data);
		response.setMemberId(data.getMemberId());
		return response;
		}
		return response;
	}

	@Override
	public RegisterResponse updateProfile(Register request) {
		RegisterResponse response=new RegisterResponse();
		Register data=loginDao.updateProfile(request);
		response.setListData(data);
		return response;
	} 
	

}
