package com.example.logistics.domain.entities;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Annotation indicating that this class serves as a base class for other entities
@MappedSuperclass
// Lombok annotations to generate getters and setters
@Getter
@Setter
// Lombok annotation to generate a no-args constructor
@NoArgsConstructor
public abstract class BaseEntity {
    // Annotation indicating the property is a primary key
    @Id
    // Annotation indicating that this is an automatically generated value
    @GeneratedValue(strategy = IDENTITY)
    // Annotation indicating the mapping to a specific column in the database
    @Column(name = "id")
    // Property representing the primary key
    private long id;
}
