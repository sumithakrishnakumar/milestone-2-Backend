package com.project.memberdetails.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.project.memberdetails.dao.ClaimDao;
import com.project.memberdetails.model.Claims;
import com.project.memberdetails.model.Register;

@Repository
public class ClaimDaoImpl implements ClaimDao {
	
	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public String saveClaimDetails(Claims claimsRequest) {
		mongoTemplate.save(claimsRequest);
		return "Claim ID "+claimsRequest.getClaimId()+" added Successfully";
	}

	@Override
	public Claims getdata(Long claimId) {
		Query query2 = new Query();
		query2.addCriteria(Criteria.where("claimId").is(claimId));
		Claims doc=mongoTemplate.findOne(query2, Claims.class);
		return doc;
	}

	@Override
	public Claims getclaimsdata(String memberId) {
		Query query2 = new Query();
		query2.addCriteria(Criteria.where("memberId").is(memberId));
		Claims doc=mongoTemplate.findOne(query2, Claims.class);
		return doc;
	}

	@Override
	public String saveClaimDependentDetails(Claims dependent, Long id) {
		mongoTemplate.save(dependent);
		return "Claim Id-"+id+" added successfully";
	}

	@Override
	public Claims getdependentData(String id) {
		Query query2 = new Query();
		query2.addCriteria(Criteria.where("memberId").is(id));
		Claims doc=mongoTemplate.findOne(query2, Claims.class);
		return doc;
	}

}
