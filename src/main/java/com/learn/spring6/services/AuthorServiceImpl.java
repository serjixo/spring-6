package com.learn.spring6.services;

import com.learn.spring6.data.AuthorRepositoryImpl;
import com.learn.spring6.domain.models.Author;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepositoryImpl authorRepository;

    public AuthorServiceImpl(AuthorRepositoryImpl authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }

}
