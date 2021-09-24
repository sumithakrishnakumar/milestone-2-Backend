package com.project.memberdetails.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.project.memberdetails.dao.RegisterDao;
import com.project.memberdetails.model.Register;

@Repository
public class RegisterDaoImpl implements RegisterDao {

	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@Override
	public String saveDetails(Register registerRequest) {
		mongoTemplate.save(registerRequest);
		return "  Registered successfully";
	}

	@Override
	public Register getRegisteruser(String memberEmail) {
		Query query2 = new Query();
		query2.addCriteria(Criteria.where("memberEmail").is(memberEmail));
		Register doc=mongoTemplate.findOne(query2, Register.class);
		
		return doc;
	} 

	
}
