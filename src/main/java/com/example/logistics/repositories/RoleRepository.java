// Define the package for this repository class
package com.example.logistics.repositories;

// Import the required classes for JPA Repository
import org.springframework.data.jpa.repository.JpaRepository;

// Import the Repository stereotype for this repository class
import org.springframework.stereotype.Repository;

// Import the entity class that the repository is meant to serve
import com.example.logistics.domain.entities.Role;

// Mark the repository class with @Repository annotation
@Repository
// Define the interface that extends JpaRepository
public interface RoleRepository extends JpaRepository<Role, Long> {
    // Define the findByAuthority method that returns Role object
    Role findByAuthority(String authority);
}

