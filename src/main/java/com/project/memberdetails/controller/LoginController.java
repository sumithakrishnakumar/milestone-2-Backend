package com.project.memberdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.memberdetails.Response.RegisterResponse;
import com.project.memberdetails.model.Login;
import com.project.memberdetails.model.Register;
import com.project.memberdetails.service.LoginService;

@RestController
@CrossOrigin(origins ="*")
public class LoginController {

	
	@Autowired
	LoginService loginService;
	
	@PostMapping("/login")
	public RegisterResponse test(@RequestBody Login loginRequest){
		RegisterResponse value=loginService.getLogin(loginRequest);
		return value; 
	}

	
	@PostMapping("/updateProfile")
	public RegisterResponse profile(@RequestBody Register request) {
		
		RegisterResponse value=loginService.updateProfile(request);
		return value;
		
	}
}
