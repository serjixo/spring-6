package com.learn.spring6.data;

import com.learn.spring6.domain.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepositoryImpl extends CrudRepository<Author, Long> {

}
