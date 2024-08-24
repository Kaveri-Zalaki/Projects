package com.test.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.test.model.Book;

@Transactional(readOnly = true)
public interface BookRepo extends JpaRepository<Book, Integer> {

	@Transactional(timeout=10)
	Book findById(int id);
	
	@Transactional(timeout=10)
	List<Book> findAll();
	
	@Transactional
	<B extends Book> B save(Book book);
	
	void delete(Book book);
}
