package com.test.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.test.model.Contact;
public interface ContactRepository extends JpaRepository<Contact, Long>{
	

}
