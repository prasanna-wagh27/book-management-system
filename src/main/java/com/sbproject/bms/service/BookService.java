package com.sbproject.bms.service;

import java.util.List;

import com.sbproject.bms.entity.Book;

public interface BookService {

	Book addBook(Book book);

	List<Book> fetchBookList();

	Book updateBook(Long bookId, Book book);

	void deleteBookById(Long bookId);

}
