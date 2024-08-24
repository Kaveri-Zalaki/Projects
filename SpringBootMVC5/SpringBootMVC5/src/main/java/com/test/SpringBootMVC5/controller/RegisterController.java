package com.test.SpringBootMVC5.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.SpringBootMVC5.model.Register;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(value = "Register Controller for validating the register fields")
public class RegisterController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@ApiOperation(value = "It will display register form and taking the user inputs ")
	@GetMapping("/register")
	public String showForm(Model model, Register register) {
		model.addAttribute("register", register);
		return "register_form";
	}
	
	
	@PostMapping("/register")
	@ApiOperation(value = "Validating and printing user details in success page")
	public String submitForm(@Valid @ModelAttribute("register")Register register, BindingResult bindingresult, Model model) {
		if(bindingresult.hasErrors()) {
			return "register_form";
		}
		return "register_success";
	}
}
