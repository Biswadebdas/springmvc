package com.nagarro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nagarro.model.Book;
import com.nagarro.service.BookService;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    
    @GetMapping("/")
    public String getAllBooks(Model model) {
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books", books);
        return "index";
    }
    
    @GetMapping("/adds")
    public String addBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "add";
    }
    
    @PostMapping("/add")
    public String addBookSubmit(@ModelAttribute Book book) {
        bookService.addBook(book);
        return "redirect:/";
    }
    
    
    @PostMapping("/edit/{id}")
    public String editBookSubmit(@ModelAttribute Book book, @PathVariable Long id) {
        book.setId(id);
        bookService.updateBook(book);
        return "redirect:/";
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return "redirect:/";
    }
}
