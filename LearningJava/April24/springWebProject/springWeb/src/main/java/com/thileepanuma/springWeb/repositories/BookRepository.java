package com.thileepanuma.springWeb.repositories;

import com.thileepanuma.springWeb.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
