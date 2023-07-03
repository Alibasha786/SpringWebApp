package com.positiveedge.SpringWebApp.repository;

import com.positiveedge.SpringWebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
