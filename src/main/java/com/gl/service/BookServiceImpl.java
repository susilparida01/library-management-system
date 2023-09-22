package com.gl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.dao.BookRepository;
import com.gl.entity.Book;


// X=>Y=>Z=>A=>B

@Service
public class BookServiceImpl implements BookService{
	
//	@Autowired
	private BookRepository bookRepository;
	
	
	@Autowired
	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository=bookRepository;
	}
	

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		List<Book> books = bookRepository.findAll();
		return books;
	}

	@Override
	public Book findById(int id) {
		// TODO Auto-generated method stub
		Optional<Book> result = bookRepository.findById(id);
		
		if(result.isPresent()) {
			return result.get();
		}
		throw new RuntimeException("Did not find a book with id "+ id);
	}

	@Override
	public void save(Book book) {
		// TODO Auto-generated method stub
		bookRepository.save(book);
		
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);
		
	}


	@Override
	public void findByAuthor(String authorName) {
		// TODO Auto-generated method stub
		List<Book> books = bookRepository.findByAuthor(authorName);
		System.out.println("book author title "+ books.get(0).getTitle());
	}
	
	
}