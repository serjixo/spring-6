package com.learn.spring6.services;

import com.learn.spring6.domain.models.Author;

public interface AuthorService {

    Iterable<Author> findAll();

}
