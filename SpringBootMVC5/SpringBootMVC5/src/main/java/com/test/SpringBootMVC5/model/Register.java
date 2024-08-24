package com.test.SpringBootMVC5.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Register {
	@Size(min = 3, max = 50)
	@NotEmpty(message= "first name is required")
	private String firstName;
	
	@Size(min = 3, max = 50)
	@NotEmpty(message= "last name is required")
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	

}
