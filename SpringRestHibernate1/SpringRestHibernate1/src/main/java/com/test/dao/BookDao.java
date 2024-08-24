package com.test.dao;

import com.test.model.Book;
import java.util.List;
import java.util.Map;

public interface BookDao {

	public Book findById(int id);
	public void remove(int id);
	public void add(Book book);
	public void update(int id, Book book);
	public List<Map<String, Object>> findAll();
	
	
}
