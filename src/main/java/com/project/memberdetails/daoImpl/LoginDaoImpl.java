package com.project.memberdetails.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.project.memberdetails.dao.LoginDao;
import com.project.memberdetails.model.Login;
import com.project.memberdetails.model.Register;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	MongoTemplate mongoTemplate;
	
	@Override
	public Register getlogindata(Login loginRequest) {
		Query query2 = new Query();
		query2.addCriteria(new Criteria().andOperator(
		        Criteria.where("memberEmail").is(loginRequest.getUserEmail()),
		        Criteria.where("memberPassword").is(loginRequest.getPassword())
		    ));
		Register doc=mongoTemplate.findOne(query2, Register.class);
		return doc;

	}

	@Override
	public Register updateProfile(Register request) {
	
		Register data=new Register();
		Query query2 = new Query();
		query2.addCriteria(Criteria.where("memberId").is(request.getMemberId()));
		Register doc=mongoTemplate.findOne(query2, Register.class);
		if(doc!=null) {
			doc.setMemberAddress(request.getMemberAddress());
			doc.setMemberEmail(request.getMemberEmail());
			doc.setMemberNumber(request.getMemberNumber());
			doc.setMemberPan(request.getMemberPan());
			doc.setMemberCountry(request.getMemberCountry());
			doc.setMemberState(request.getMemberState());
			
		}
		mongoTemplate.save(doc);

		return doc;
	}

}
