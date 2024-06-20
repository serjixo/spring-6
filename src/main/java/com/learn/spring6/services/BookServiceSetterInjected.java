package com.learn.spring6.services;

import com.learn.spring6.data.BookRepositoryImpl;
import com.learn.spring6.domain.models.Book;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Data
@Primary
@Service
public class BookServiceSetterInjected implements BookService {

    private BookRepositoryImpl bookRepositoryImpl;

    @Override
    public Iterable<Book> findAll() {
        return null;
    }

    @Autowired
    public void setRepository(BookRepositoryImpl bookRepository) {
        this.bookRepositoryImpl = bookRepository;
    }

}
