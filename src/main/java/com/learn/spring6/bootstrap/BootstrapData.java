package com.learn.spring6.bootstrap;

import com.learn.spring6.data.AuthorRepositoryImpl;
import com.learn.spring6.data.BookRepositoryImpl;
import com.learn.spring6.data.PublisherRepositoryImpl;
import com.learn.spring6.domain.models.Author;
import com.learn.spring6.domain.models.Book;
import com.learn.spring6.domain.models.Publisher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final BookRepositoryImpl bookRepository;

    private final AuthorRepositoryImpl authorRepository;

    private final PublisherRepositoryImpl publisherRepository;

    public BootstrapData(BookRepositoryImpl bookRepository, AuthorRepositoryImpl authorRepository, PublisherRepositoryImpl publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book book = new Book();
        book.setTitle("Book Title");

        Author author = new Author();
        author.setFirstName("John");

        Publisher publisher = new Publisher();
        publisher.setName("Publisher Name");

        Publisher savedPublisher = publisherRepository.save(publisher);
        book.setPublisher(savedPublisher);

        Author savedAuthor = authorRepository.save(author);
        Book savedBook = bookRepository.save(book);

        savedAuthor.getBooks().add(book);
        savedBook.getAuthors().add(author);

        authorRepository.save(savedAuthor);
        bookRepository.save(savedBook);

        System.out.println("____________________________________");
        System.out.println(authorRepository.count());
        System.out.println(bookRepository.count());
        System.out.println(savedBook.getPublisher().getName());


    }

}

