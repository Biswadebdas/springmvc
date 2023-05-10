package com.nagarro.serviceImp;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nagarro.model.Book;
import com.nagarro.service.BookService;

@Service
public class BookServiceImp implements BookService {
    private final String API_URL = "http://localhost:3000/api/books";
    private RestTemplate restTemplate;
    
    public BookServiceImp() {
        this.restTemplate = new RestTemplate();
    }
    
    @Override
    public List<Book> getAllBooks() {
        ResponseEntity<List<Book>> response = restTemplate.exchange(API_URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<Book>>() {});
        return response.getBody();
    }
    
    
    @Override
    public void addBook(Book book) {
        restTemplate.postForObject(API_URL, book, Book.class);
    }
    
    @Override
    public void updateBook(Book book) {
        restTemplate.put(API_URL + "/" + book.getId(), book);
    }
    
    @Override
    public void deleteBook(Long id) {
        restTemplate.delete(API_URL + "/" + id);
    }
}