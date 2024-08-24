package com.test.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Book")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Book implements Serializable{
	private static final long serialVersionUID=1L;
	private static final Logger logger= LoggerFactory.getLogger(Book.class);
@Id
@GeneratedValue(generator="BOOK_SEQ", strategy=GenerationType.SEQUENCE)
@SequenceGenerator(name="BOOK_SEQ", sequenceName="BOOK_SEQ",allocationSize=1)
@Column(name="Book_ID", unique=true, nullable=false, precision=10,scale=0)
@Getter @Setter
private Integer bid;

@Column(name="Book_name",nullable=true, length=50 )
@Getter @Setter
private String bname;

@Column(name="Book_author", nullable=true, length=50)
@Getter @Setter
private String author;

public Book() {}
public Book(String bname, String author) {
	this.bname=bname;
	this.author=author;
	
}
public Integer getBid() {
	return bid;
}
public void setBid(Integer bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}

public static Logger getLogger() {
	return logger;
}
}

