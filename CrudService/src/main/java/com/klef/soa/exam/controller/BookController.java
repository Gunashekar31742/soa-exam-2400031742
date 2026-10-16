package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.klef.soa.exam.entity.Book;
import com.klef.soa.exam.service.BookService;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String home() {
        return "CrudService is running successfully!";
    }

    @PostMapping("/Add")
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @GetMapping("/DisplayAll")
    public List<Book> displayAllBooks() {
        return bookService.getAllBooks();
    }

    @DeleteMapping("/Delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        return bookService.deleteBook(id);
    }
}