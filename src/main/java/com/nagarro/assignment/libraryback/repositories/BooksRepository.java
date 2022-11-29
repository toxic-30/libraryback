package com.nagarro.assignment.libraryback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.assignment.libraryback.entities.Books;

public interface BooksRepository extends JpaRepository<Books, Integer>{

}
