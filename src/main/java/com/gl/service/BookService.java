package com.gl.service;
import java.util.List;

import com.gl.entity.Book;

public interface BookService{
	
	public List<Book> findAll();
	
	public Book findById(int id);
	
	public void save(Book book);
	
	public void deleteById(int id);
	
	public void findByAuthor(String authorName);
	
}