package com.project.memberdetails.dao;

import com.project.memberdetails.model.Register;

public interface RegisterDao {

	String saveDetails(Register registerRequest);

	Register getRegisteruser(String memberEmail);

}
  