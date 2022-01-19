package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.example.demo.model.Users;
@Component
public interface UserRepository extends JpaRepository<Users, Integer> {
    @Query(" select u from Users u " +
            " where u.username = ?1")
    Optional<Users> findUsersWithName(String username);

    Users findByUserId(long id);
}