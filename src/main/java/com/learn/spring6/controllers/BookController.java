package com.learn.spring6.controllers;

import com.learn.spring6.services.BookService;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

}
