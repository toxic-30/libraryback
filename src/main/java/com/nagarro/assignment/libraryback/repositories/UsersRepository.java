package com.nagarro.assignment.libraryback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.assignment.libraryback.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>
{

}
