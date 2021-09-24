package com.project.memberdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.memberdetails.Response.RegisterResponse;
import com.project.memberdetails.model.Register;
import com.project.memberdetails.service.RegisterService;

@RestController
@CrossOrigin(origins ="*")
public class RegisterController {
	
	@Autowired
	RegisterService registerService;
	
	@GetMapping("/test")
	public String test(){
		System.out.println("welcome");
		return "welcome"; 
	}

	@PostMapping("/register")
	public RegisterResponse register(@RequestBody Register registerRequest)
	{
		RegisterResponse data=registerService.registerDetails(registerRequest);
		System.out.println(data);
		return data;
		 
	}
	
	
	
}
