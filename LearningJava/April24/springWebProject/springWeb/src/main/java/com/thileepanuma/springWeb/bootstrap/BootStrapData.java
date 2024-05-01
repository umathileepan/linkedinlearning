package com.thileepanuma.springWeb.bootstrap;

import com.thileepanuma.springWeb.domain.Author;
import com.thileepanuma.springWeb.domain.Book;
import com.thileepanuma.springWeb.domain.Publisher;
import com.thileepanuma.springWeb.repositories.AuthorRepository;
import com.thileepanuma.springWeb.repositories.BookRepository;
import com.thileepanuma.springWeb.repositories.PubliserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component

public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PubliserRepository publiserRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PubliserRepository publiserRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publiserRepository = publiserRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in Bootstrap");

        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("Wallington");
        publisher.setState("Surrey");

        publiserRepository.save(publisher);

        System.out.println("Publisher Count: " + publiserRepository.count());

        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design","2341234");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publiserRepository.save(publisher);

        Author rod = new Author("Rod","Johnson");
        Book noEJB = new Book("J2EE Development wothout EJB","89343422");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publiserRepository.save(publisher);


        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Publisher Number of Books: " + publisher.getBooks().size());
    }
}
