package com.example.logistics.domain.entities;

import static java.util.Collections.emptySet;
import static javax.persistence.FetchType.EAGER;

import java.util.Set;

import javax.persistence.*;

import org.springframework.security.core.userdetails.UserDetails;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "users")
public class User  implements UserDetails {
    private static final long serialVersionUID = -6720418047768269050L;

    // Annotation indicating the field as the primary key
    @Id
    // Annotation indicating that the ID is auto generated using GenerationType.IDENTITY strategy
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Annotation indicating the column name in the database
    @Column(name = "id")
    private long id;

    // Annotation indicating the column name in the database and its properties (unique, nullable)
    @Column(name = "username", unique = true, nullable = false)
    private String username;

    // Annotation indicating the column name in the database and its properties (nullable)
    @Column(name = "password", nullable = false)
    private String password;

    // Annotation indicating the relationship between User and Role entities, fetch type, join columns, and inverse join columns
    @ManyToMany(targetEntity = Role.class, fetch = EAGER)
    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private Set<Role> authorities = emptySet();

    // Implementation of UserDetails interface methods for User account status
    @Override
    @Transient
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    @Transient
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    @Transient
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    @Transient
    public boolean isEnabled() {
        return true;
    }

    // Overridden toString method for the User class
    @Override
    public String toString() {
        return username;
    }
}
