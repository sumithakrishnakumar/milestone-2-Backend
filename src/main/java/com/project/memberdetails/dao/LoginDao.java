package com.project.memberdetails.dao;

import com.project.memberdetails.model.Login;
import com.project.memberdetails.model.Register;

public interface LoginDao {

	Register getlogindata(Login loginRequest);

	Register updateProfile(Register request); 

}
