package com.test.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Book;
import com.test.service.BookService;


@RestController
@RequestMapping(value="/api/books")
public class BookController {

	private static final Logger logger=LoggerFactory.getLogger(BookController.class);
	
	BookService bservice;
	
	@Autowired
	public BookController(BookService bservice) {
		this.bservice=bservice;
	}
	
	@RequestMapping(value="",method=RequestMethod.POST)
	public ResponseEntity<Void> create(@RequestBody Book b)
	{
		try {
			logger.info(b.getBname());
			logger.info(b.getAuthor());
			bservice.add(b);
			return ResponseEntity.status(HttpStatus.OK).build();
		}catch(Exception e) {
			e.printStackTrace();
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
}
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public ResponseEntity<List<Map<String, Object>>> getAll(){
		try {
			List<Map<String, Object>> res= bservice.findAll();
			return ResponseEntity.status(HttpStatus.OK).body(res);
		}catch(Exception e) {
			logger.error(e.getMessage(),e);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<Book> getById(@PathVariable("id") int id){
		try {
			Book b=bservice.findById(id);
			if(b!=null) {
				return ResponseEntity.status(HttpStatus.OK).body(b);
			}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}	}catch(Exception e) {
			logger.error(e.getMessage(),e);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}	
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@PathVariable("id") int id,@RequestBody Book b )
	{
		try {
			bservice.update(id, b);
			return ResponseEntity.status(HttpStatus.OK).build();
			
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}

	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable("id") int id){
		try {
			bservice.remove(id);
			return ResponseEntity.status(HttpStatus.OK).build();	
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}


}