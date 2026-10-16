package com.klef.soa.exam.service;

import java.util.List;
import com.klef.soa.exam.entity.Book;

public interface BookService {

    Book addBook(Book book);

    List<Book> getAllBooks();

    String deleteBook(Long id);
}