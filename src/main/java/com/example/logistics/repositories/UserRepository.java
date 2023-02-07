package com.example.logistics.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.logistics.domain.entities.User;

// This is the UserRepository interface, which extends the JpaRepository interface
// The JpaRepository interface provides basic CRUD operations for entities in a database
// This interface is specifically for the User entity, which has a Long type primary key

@Repository // This annotation indicates that this interface is a repository, used for data access
public interface UserRepository extends JpaRepository<User, Long> {
    // This method finds a user with the given username
    Optional<User> findByUsername(String username);
}
