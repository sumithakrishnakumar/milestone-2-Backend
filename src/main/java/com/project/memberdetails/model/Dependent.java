package com.project.memberdetails.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Dependent {
	
	@Id
	private ObjectId id;
	private String memberId;
	private String dependent1Id;
	private String dependent2Id;

	private String registerdepedent2name;
	private String registerdepedent2dob;
	private String registerdepedent2number;
	private String registerdepedent2relationship;
	private String registerdepedentname;
	private String registerdepedentdob;
	private String registerdepedentnumber;
	private String registerdepedentrelationship;
	private String dependentName;
	private String dependentDob;
	private String dependentNumber;
	private String dependentRelationship;
	
	private Dependent dependent1;
	private Dependent dependent2;
	
	
	
	
	
	public String getRegisterdepedentname() {
		return registerdepedentname;
	}
	public void setRegisterdepedentname(String registerdepedentname) {
		this.registerdepedentname = registerdepedentname;
	}
	public String getRegisterdepedentdob() {
		return registerdepedentdob;
	}
	public void setRegisterdepedentdob(String registerdepedentdob) {
		this.registerdepedentdob = registerdepedentdob;
	}
	public String getRegisterdepedentnumber() {
		return registerdepedentnumber;
	}
	public void setRegisterdepedentnumber(String registerdepedentnumber) {
		this.registerdepedentnumber = registerdepedentnumber;
	}
	public String getRegisterdepedentrelationship() {
		return registerdepedentrelationship;
	}
	public void setRegisterdepedentrelationship(String registerdepedentrelationship) {
		this.registerdepedentrelationship = registerdepedentrelationship;
	}
	public String getRegisterdepedent2name() {
		return registerdepedent2name;
	}
	public void setRegisterdepedent2name(String registerdepedent2name) {
		this.registerdepedent2name = registerdepedent2name;
	}
	public String getRegisterdepedent2dob() {
		return registerdepedent2dob;
	}
	public void setRegisterdepedent2dob(String registerdepedent2dob) {
		this.registerdepedent2dob = registerdepedent2dob;
	}
	public String getRegisterdepedent2number() {
		return registerdepedent2number;
	}
	public void setRegisterdepedent2number(String registerdepedent2number) {
		this.registerdepedent2number = registerdepedent2number;
	}
	public String getRegisterdepedent2relationship() {
		return registerdepedent2relationship;
	}
	public void setRegisterdepedent2relationship(String registerdepedent2relationship) {
		this.registerdepedent2relationship = registerdepedent2relationship;
	}
	public String getDependent1Id() {
		return dependent1Id;
	}
	public void setDependent1Id(String dependent1Id) {
		this.dependent1Id = dependent1Id;
	}
	public String getDependent2Id() {
		return dependent2Id;
	}
	public void setDependent2Id(String dependent2Id) {
		this.dependent2Id = dependent2Id;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public Dependent getDependent1() {
		return dependent1;
	}
	public void setDependent1(Dependent dependent1) {
		this.dependent1 = dependent1;
	}
	public Dependent getDependent2() {
		return dependent2;
	}
	public void setDependent2(Dependent dependent2) {
		this.dependent2 = dependent2;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getDependentName() {
		return dependentName;
	}
	public void setDependentName(String dependentName) {
		this.dependentName = dependentName;
	}
	public String getDependentDob() {
		return dependentDob;
	}
	public void setDependentDob(String dependentDob) {
		this.dependentDob = dependentDob;
	}
	public String getDependentNumber() {
		return dependentNumber;
	}
	public void setDependentNumber(String dependentNumber) {
		this.dependentNumber = dependentNumber;
	}
	public String getDependentRelationship() {
		return dependentRelationship;
	}
	public void setDependentRelationship(String dependentRelationship) {
		this.dependentRelationship = dependentRelationship;
	}
	

}
