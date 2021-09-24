package com.project.memberdetails.dao;

import com.project.memberdetails.Response.DependentResponse;
import com.project.memberdetails.model.Dependent;

public interface DependentDao {

	DependentResponse savedata(Dependent request);

	DependentResponse savedata2(Dependent request);

	DependentResponse get(String header);

	DependentResponse getData(String header);

	Dependent save(Dependent finaldata);
 
 
} 
  