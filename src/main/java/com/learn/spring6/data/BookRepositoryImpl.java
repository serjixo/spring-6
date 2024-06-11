package com.learn.spring6.data;

import com.learn.spring6.domain.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepositoryImpl extends CrudRepository<Book, Long> {

}
