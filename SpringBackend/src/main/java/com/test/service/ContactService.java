package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.Contact;
import com.test.repo.ContactRepository;



@Service
public class ContactService {
	@Autowired 
	ContactRepository repo ;
	
	public Contact saveResponse(Contact contact) {
		return repo.save(contact);
	}

}
