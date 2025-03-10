package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.FeedBack;
import com.test.repo.FeedBackRepository;



@Service
public class FeedBackService {
	@Autowired 
	FeedBackRepository repo ;
	
	public FeedBack saveResponse(FeedBack contact) {
		return repo.save(contact);
	}

}
