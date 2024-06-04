package com.library.library.repository;

import org.springframework.data.repository.CrudRepository;
import com.library.library.model.Books;
//repository that extends CrudRepository
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}