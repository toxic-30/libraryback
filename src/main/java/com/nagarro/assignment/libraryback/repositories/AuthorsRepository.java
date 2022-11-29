package com.nagarro.assignment.libraryback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.assignment.libraryback.entities.Authors;

public interface AuthorsRepository extends JpaRepository<Authors , Integer>{

}
