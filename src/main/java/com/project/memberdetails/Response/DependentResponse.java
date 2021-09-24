package com.project.memberdetails.Response;

import com.project.memberdetails.model.Dependent;

public class DependentResponse {

	
	private String successResponse;
	private Dependent dependent;
	
	

	public Dependent getDependent() {
		return dependent;
	}

	public void setDependent(Dependent dependent) {
		this.dependent = dependent;
	}

	public String getSuccessResponse() {
		return successResponse;
	}

	public void setSuccessResponse(String successResponse) {
		this.successResponse = successResponse;
	}
	
	
}
