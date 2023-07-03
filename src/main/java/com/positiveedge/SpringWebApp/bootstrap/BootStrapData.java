package com.positiveedge.SpringWebApp.bootstrap;

import com.positiveedge.SpringWebApp.domain.Author;
import com.positiveedge.SpringWebApp.domain.Book;
import com.positiveedge.SpringWebApp.domain.Publisher;
import com.positiveedge.SpringWebApp.repository.AuthorRepository;
import com.positiveedge.SpringWebApp.repository.BookRepository;
import com.positiveedge.SpringWebApp.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.println("Starting boot strap....");

        Publisher publisher = new Publisher();
        publisher.setName("Shaik Publisher.");
        publisher.setCountry("India");
        publisher.setState("AP");

        publisherRepository.save(publisher);

        System.out.println("Publisher Count: " + publisherRepository.count());

        Author author1 = new Author("Ali", "Basha");
        Book book1  = new Book("Secret","1234");
        author1.getBooks().add(book1);
        book1.getAuthors().add(author1);
        book1.setPublisher(publisher);

        publisher.getBooks().add(book1);

        authorRepository.save(author1);
        bookRepository.save(book1);
        publisherRepository.save(publisher);


        Author author2 = new Author("Shaik", "Ali");
        Book book2  = new Book("Inception","4321");
        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);
        book2.setPublisher(publisher);

        publisher.getBooks().add(book2);

        authorRepository.save(author2);
        bookRepository.save(book2);
        publisherRepository.save(publisher);

        System.out.println("Number of Books: "+ bookRepository.count());
        System.out.println("Publisher No Of Books: " + publisher.getBooks().size());


    }
}
