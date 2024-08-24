package com.test.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.model.Contact;
import com.test.service.ContactService;



@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("/api/auth")
public class ContactUsController {

	@Autowired
	private ContactService service;
	
	@PostMapping("/contact")
	public Contact saveResponseMessage(@RequestBody Contact contact) {
		
		return service.saveResponse(contact);
		
	}
}