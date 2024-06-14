package com.learn.spring6.services;

import com.learn.spring6.domain.models.Book;
import org.springframework.stereotype.Service;

@Service
public interface BookService {

    Iterable<Book> findAll();

}
