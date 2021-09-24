package com.project.memberdetails.service;

import com.project.memberdetails.Response.DependentResponse;
import com.project.memberdetails.model.Dependent;

public interface DependentService {

	DependentResponse saveDependent(Dependent request, String header);

	DependentResponse saveDependent2(Dependent request, String header);

	DependentResponse getList( String header);

	DependentResponse getListdata(String header);

	DependentResponse edit(String header, Dependent request);
 
}
     