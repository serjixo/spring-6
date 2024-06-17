package com.learn.spring6.services;

import com.learn.spring6.data.BookRepositoryImpl;
import com.learn.spring6.domain.models.Book;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private BookRepositoryImpl bookRepository;

    public BookServiceImpl(BookRepositoryImpl bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();

    }

}
