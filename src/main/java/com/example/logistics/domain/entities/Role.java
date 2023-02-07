package com.example.logistics.domain.entities;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roles")
public class Role  implements GrantedAuthority {

    // The primary key of the role in the database
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    // Serial version UID to ensure compatibility during deserialization
    private static final long serialVersionUID = 7373030764827481736L;

    // The name of the role
    @Column(name = "authority", nullable = false)
    private String authority;

    // Constructor to create a new role
    public Role(String authority){
        this.authority = authority;
    }
}
