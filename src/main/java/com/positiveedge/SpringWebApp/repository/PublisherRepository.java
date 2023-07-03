package com.positiveedge.SpringWebApp.repository;

import com.positiveedge.SpringWebApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
