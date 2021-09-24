package com.project.memberdetails.service;

import com.project.memberdetails.Response.RegisterResponse;
import com.project.memberdetails.model.Login;
import com.project.memberdetails.model.Register;

public interface LoginService {

	RegisterResponse getLogin(Login loginRequest);

	RegisterResponse updateProfile(Register request); 

	
}
