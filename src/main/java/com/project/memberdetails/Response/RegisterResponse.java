package com.project.memberdetails.Response;

import com.project.memberdetails.model.Register;

public class RegisterResponse {

	private String message;
	private String error;
	private Register listData;
	private String memberId;
	
	
	
	
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public Register getListData() {
		return listData;
	}
	public void setListData(Register listData) {
		this.listData = listData;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	
	
}
