// Package declaration
package com.example.logistics.repositories;

// Importing necessary classes
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.logistics.domain.entities.Office;

// Annotation to indicate this is a repository class
@Repository
// Interface extending JpaRepository to perform CRUD operations on the "Office" entity
public interface OfficeRepository extends JpaRepository<Office, Long> {
    // Custom method to find an office by its address
    Optional<Office> findByAddress(String address);
}
