package com.sbproject.bms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbproject.bms.entity.Book;
import com.sbproject.bms.repository.BookRepository;
import com.sbproject.bms.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book addBook(Book book) {
		
		return bookRepository.save(book);
	}

	@Override
	public List<Book> fetchBookList() {
		
		return bookRepository.findAll();
	}

	@Override
	public Book updateBook(Long bookId, Book book) {
		Book updatedBook= bookRepository.getById(bookId);
		
		updatedBook.setBookName(book.getBookName());
		updatedBook.setBookType(book.getBookType());
		updatedBook.setBookPrice(book.getBookPrice());
		
		
		return bookRepository.save(updatedBook);
	}

	@Override
	public void deleteBookById(Long bookId) {
		
		bookRepository.deleteById(bookId);
		
	}
	
	
	
	
	
}
