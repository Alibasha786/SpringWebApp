package com.positiveedge.SpringWebApp.repository;

import com.positiveedge.SpringWebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
