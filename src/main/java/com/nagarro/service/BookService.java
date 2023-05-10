package com.nagarro.service;

import java.util.List;

import com.nagarro.model.Book;

public interface BookService {
	List<Book> getAllBooks();
    void addBook(Book book);
    void updateBook(Book book);
    void deleteBook(Long id);

}
