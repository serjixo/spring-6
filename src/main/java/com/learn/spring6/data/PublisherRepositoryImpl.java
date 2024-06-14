package com.learn.spring6.data;

import com.learn.spring6.domain.models.Author;
import com.learn.spring6.domain.models.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepositoryImpl extends CrudRepository<Publisher, Long> {

}
