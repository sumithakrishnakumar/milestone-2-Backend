package com.project.memberdetails.serviceImpl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.memberdetails.Response.DependentResponse;
import com.project.memberdetails.dao.DependentDao;
import com.project.memberdetails.model.Dependent;
import com.project.memberdetails.service.DependentService;

@Service
public class DependentServiceImpl implements DependentService {
	
	@Autowired
	DependentDao dependentDao;

	@Override
	public DependentResponse saveDependent(Dependent request,String header) {
		
		String id=randomMemberID();
		request.setMemberId(header);
		request.setDependent1Id(id); 
		DependentResponse data=dependentDao.savedata(request);
		return data;
	}

	@Override
	public DependentResponse saveDependent2(Dependent request, String header) {
		
		String id=randomMemberID();
		request.setMemberId(header);
		request.setDependent2Id(id); 

		DependentResponse data=dependentDao.savedata2(request);
		return data;
	}

	private String randomMemberID() {
		 Random r = new Random();
		 String id=null;
		    String s = r.ints(48, 123)
		                .filter(num -> (num < 58 || num > 64) && (num < 91 || num > 96))
		    .limit(3) 
		    .mapToObj(c -> (char) c).collect(StringBuffer::new, StringBuffer::append, StringBuffer::append)
		          .toString();
		    System.out.println("Random alphanumeric string is: " + s);
		    id="R- "+s;
			return id;
	}

	@Override
	public DependentResponse getList(String header) {
		DependentResponse data=dependentDao.get(header);

		return data;
	}

	@Override
	public DependentResponse getListdata(String header) {
		DependentResponse data=dependentDao.getData(header);

		return data;
	}

	@Override
	public DependentResponse edit(String header, Dependent request) {
		DependentResponse data=dependentDao.get(header);
		Dependent finaldata=new Dependent();
		finaldata.setDependent1(data.getDependent());
		finaldata.setDependentDob(request.getRegisterdepedentdob());
		Dependent value=dependentDao.save(finaldata);
		data.setSuccessResponse("Edited successfully");
		return data;
	}

}
