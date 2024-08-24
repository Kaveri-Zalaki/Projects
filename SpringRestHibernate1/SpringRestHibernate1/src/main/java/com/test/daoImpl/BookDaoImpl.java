package com.test.daoImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.test.dao.BookDao;
import com.test.model.Book;
import com.test.repository.BookRepo;

@Repository
public class BookDaoImpl implements BookDao{

	private static final Logger logger=LoggerFactory.getLogger(BookDaoImpl.class);
	
	@Autowired
	private BookRepo bRepo;
	
	public BookDaoImpl() {}
	
	@Override
	public Book findById(int id) {
		// TODO Auto-generated method stub
		try {
			return bRepo.findById(id);
		}
		catch(Exception e) {
			logger.error(e.getMessage(),e);
		}
		return null;
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		try {
			Book b=new Book();
			b.setBid(id);
			bRepo.delete(b);
		}catch(Exception e) {
			logger.error(e.getMessage(),e);
		}
	}

	@Override
	public void add(Book book) {
		// TODO Auto-generated method stub
		try {
			bRepo.save(book);	
		}
		catch(Exception e) {
			logger.error(e.getMessage(),e);
		}
	}

	@Override
	public void update(int id, Book book) {
		// TODO Auto-generated method stub
		try {
			book.setBid(id);
			bRepo.save(book);
		}catch(Exception e) {
			logger.error(e.getMessage(),e);
		}
		
	}

	@Override
	public List<Map<String, Object>> findAll() {
		// TODO Auto-generated method stub
		try {
			List<Map<String,Object>> ls=new ArrayList<>();
			Map<String,Object> m=new HashMap<>();
			List<Book> res=bRepo.findAll();
			for(Book b:res) {
				m=new HashMap<>();
				m.put(b.getBid().toString(), b);
				ls.add(m);
			}
			return ls;
		}catch(Exception e) {
			logger.error(e.getMessage(),e);
		}
		return null;
	}
	

}
