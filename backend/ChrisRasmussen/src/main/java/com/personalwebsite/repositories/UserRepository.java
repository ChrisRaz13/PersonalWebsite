package com.personalwebsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalwebsite.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {  
    User findByUsername(String username);
}
