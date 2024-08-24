package com.test.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.model.FeedBack;
import com.test.service.FeedBackService;



@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("/api/auth")
public class FeedBackController {

	@Autowired
	private FeedBackService service;
	
	@PostMapping("/contact")
	public FeedBack saveResponseMessage(@RequestBody FeedBack contact) {
		
		return service.saveResponse(contact);
		
	}
}