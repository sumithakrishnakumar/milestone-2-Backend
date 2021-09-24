package com.project.memberdetails.Response;

import com.project.memberdetails.model.Claims;
import com.project.memberdetails.model.DependentClaims;

public class ClaimsResponse {
	
	private String successMessage;
	
	private Claims data;
	
	private DependentClaims listData;
	
	

	public DependentClaims getListData() {
		return listData;
	}

	public void setListData(DependentClaims listData) {
		this.listData = listData;
	}

	public Claims getData() {
		return data;
	}

	public void setData(Claims data) {
		this.data = data;
	}

	public String getSuccessMessage() {
		return successMessage;
	}

	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}
	

}
