package com.example.books_service.core.utils;

import com.example.books_service.core.dto.Book;
import org.springframework.stereotype.Component;

@Component
public interface SaveBookService {
    public Book saveBook(Book book);
}