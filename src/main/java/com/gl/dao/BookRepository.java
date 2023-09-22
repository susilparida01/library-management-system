package com.gl.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
	
	List<Book> findByAuthor(String author);
	
	List<Book> findByAuthorAndCategory(String author, String category);

}
