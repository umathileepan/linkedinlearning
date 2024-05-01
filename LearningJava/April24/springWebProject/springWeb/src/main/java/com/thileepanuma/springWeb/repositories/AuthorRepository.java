package com.thileepanuma.springWeb.repositories;

import com.thileepanuma.springWeb.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
