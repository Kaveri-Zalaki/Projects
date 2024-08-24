package com.test.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.BookDao;
import com.test.model.Book;


@Service
@Transactional
public class BookService {

	@Autowired
	private BookDao bdao;
	
	public BookService() {}
	
	public Book findById(int id) {
		if(id<=0) {
			throw new IllegalArgumentException("Id cannot be 0 and < 0");
		}
		return bdao.findById(id);
	}
	
	public void remove(int id) {
		if(id<=0) {
			throw new IllegalArgumentException("ID cannot be 0 and < 0");
		}
		bdao.remove(id);
	}
	public void add(Book book) {
		if(book==null) {
			throw new IllegalArgumentException("The passed object cannot be null");
			
		}
		bdao.add(book);
	}
	public void update(int id, Book book) {
		if(id<=0 && book==null) {
			throw new IllegalArgumentException("the passed object cannot be null");
		}
		bdao.update(id, book);
	}
	public List<Map<String, Object>> findAll(){
		List<Map<String,Object>> res=bdao.findAll();
		if(res.size()>0) {
			return res;
		}
		else {
		return null;
		}
		
	}
	
}
