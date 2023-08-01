package com.sbproject.bms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sbproject.bms.entity.Book;
import com.sbproject.bms.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping("/books/add")
	public Book addBook(@RequestBody Book book) {
		
		return bookService.addBook(book);
	}
	
	@GetMapping("/books")
	public List<Book> fetchBookList(){
		
		return bookService.fetchBookList();
	}
	
	@PutMapping("/books/update/{id}")

	public Book updateBook(@PathVariable ("id") Long bookId, @RequestBody Book book) {
		
		return bookService.updateBook(bookId, book);
	}
	
	@DeleteMapping("/books/delete/{id}")
	public void deleteBookById(@PathVariable("id") Long bookId) {
		
		bookService.deleteBookById(bookId);
	}
}
