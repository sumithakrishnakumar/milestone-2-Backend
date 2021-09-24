package com.project.memberdetails.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.project.memberdetails.Response.DependentResponse;
import com.project.memberdetails.dao.DependentDao;
import com.project.memberdetails.model.Dependent;
import com.project.memberdetails.model.Register;

@Repository
public class DependentDaoImpl implements DependentDao {
	
	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public DependentResponse savedata(Dependent request) {
		DependentResponse response=new DependentResponse();
		Dependent finaldata=new Dependent();

		Dependent data=new Dependent();
		data.setDependentName(request.getRegisterdepedentname());
		data.setDependentNumber(request.getRegisterdepedentnumber());
		data.setDependentDob(request.getRegisterdepedentdob());
		data.setDependentRelationship(request.getRegisterdepedentrelationship()); 
		data.setDependent1Id(request.getDependent1Id());
		finaldata.setDependent1(data); 
		finaldata.setMemberId(request.getMemberId()); 
		mongoTemplate.save(finaldata);
		response.setSuccessResponse("Dependent-1 Id "+data.getDependent1Id()+" Added Successfully");
		return response;
	} 

	@Override
	public DependentResponse savedata2(Dependent request) {
		DependentResponse response=new DependentResponse();
		Dependent data=new Dependent();
		data.setDependentName(request.getRegisterdepedent2name());
		data.setDependentNumber(request.getRegisterdepedent2number());
		data.setDependentDob(request.getRegisterdepedent2dob());
		data.setDependentRelationship(request.getRegisterdepedent2relationship()); 
		data.setDependent2Id(request.getDependent2Id());
		Query query2 = new Query();
		query2.addCriteria(Criteria.where("memberId").is(request.getMemberId()));
		Dependent doc=mongoTemplate.findOne(query2, Dependent.class);
		doc.setDependent2(data);
		mongoTemplate.save(doc);
		response.setSuccessResponse("Dependent-2 Id "+data.getDependent2Id()+" Added Successfully");
		return response;
	}

	@Override
	public DependentResponse get(String header) {
		DependentResponse response= new DependentResponse();
		
		Query query2 = new Query();
		query2.addCriteria(Criteria.where("memberId").is(header));
		Dependent res= mongoTemplate.findOne(query2, Dependent.class);
		response.setDependent(res.getDependent1());
		return response;
	}

	@Override
	public DependentResponse getData(String header) {
	DependentResponse response= new DependentResponse();
		
		Query query2 = new Query();
		query2.addCriteria(Criteria.where("memberId").is(header));
		Dependent res= mongoTemplate.findOne(query2, Dependent.class);
		response.setDependent(res.getDependent2());
		return response;
	}

	@Override
	public Dependent save(Dependent finaldata) {
		Dependent data=mongoTemplate.save(finaldata);
		return data;
	}

	

}
