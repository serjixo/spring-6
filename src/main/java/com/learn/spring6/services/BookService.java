package com.learn.spring6.services;

import com.learn.spring6.domain.models.Book;

public interface BookService {

    Iterable<Book> findAll();

}
