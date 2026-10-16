package com.klef.soa.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.soa.exam.entity.Book;

public interface BookRepository
        extends JpaRepository<Book, Long> {
}