package com.example.logistics.domain.entities;

import static javax.persistence.FetchType.EAGER;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "offices")
public class Office {
    // Annotation to indicate the primary key
    @Id
    // Annotation to specify the generation strategy for the primary key value
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Annotation to specify the mapping of the column in the database table
    @Column(name = "ID")
    private long id;

    // Annotation to specify the mapping of the column in the database table
    // Also specify that the address must be unique and cannot be null
    @Column(name = "address", unique = true, nullable = false)
    private String address;

    // Annotation to specify a many-to-many relationship with the User entity
    // The targetEntity attribute specifies the target of the relationship
    // The fetch attribute specifies the fetch type of the relationship
    @ManyToMany(targetEntity = User.class, fetch = EAGER)
    // Annotation to specify the join table for the many-to-many relationship
    // The joinColumns attribute specifies the join columns for the office entity
    // The inverseJoinColumns attribute specifies the join columns for the user entity
    @JoinTable(name = "office_employees", joinColumns = @JoinColumn(name = "office_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))
    private Set<User> employees = new HashSet<>();

    // A constructor that accepts the address and employees as parameters
    public Office(String address, Set<User> employees) {
        this.address = address;
        this.employees = employees;
    }
}

