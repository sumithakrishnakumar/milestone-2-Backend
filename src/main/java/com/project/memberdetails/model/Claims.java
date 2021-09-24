package com.project.memberdetails.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Claims {
	
	@Id
	private ObjectId id;
	private String memberId;
	private Long claimId;
	private String claimname;
	private String claimdob;
	private String claimadmission;
	private String claimdischarge;
	private String providerName;
	private String billamount;
	private DependentClaims dependent1Claims;
	private DependentClaims dependent2Claims;

	
	
	
	
	public DependentClaims getDependent2Claims() {
		return dependent2Claims;
	}
	public void setDependent2Claims(DependentClaims dependent2Claims) {
		this.dependent2Claims = dependent2Claims;
	}
	public DependentClaims getDependent1Claims() {
		return dependent1Claims;
	}
	public void setDependent1Claims(DependentClaims dependent1Claims) {
		this.dependent1Claims = dependent1Claims;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public Long getClaimId() {
		return claimId;
	}
	public void setClaimId(Long claimId) {
		this.claimId = claimId;
	}
	public String getClaimname() {
		return claimname;
	}
	public void setClaimname(String claimname) {
		this.claimname = claimname;
	}
	public String getClaimdob() {
		return claimdob;
	}
	public void setClaimdob(String claimdob) {
		this.claimdob = claimdob;
	}
	public String getClaimadmission() {
		return claimadmission;
	}
	public void setClaimadmission(String claimadmission) {
		this.claimadmission = claimadmission;
	}
	public String getClaimdischarge() {
		return claimdischarge;
	}
	public void setClaimdischarge(String claimdischarge) {
		this.claimdischarge = claimdischarge;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	public String getBillamount() {
		return billamount;
	}
	public void setBillamount(String billamount) {
		this.billamount = billamount;
	}


	
	
	
}
