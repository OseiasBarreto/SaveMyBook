package com.savemybook.service;

import com.savemybook.entity.Book;
import com.savemybook.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Os metodos virao aqui

}
