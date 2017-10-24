package com.jaiseSpring5.Spring5App1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jaiseSpring5.Spring5App1.model.Book;
@Repository
public interface BookRepository extends CrudRepository<Book,Long> {

}
