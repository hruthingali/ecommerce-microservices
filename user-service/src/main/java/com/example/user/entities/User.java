package com.example.user.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor  // ✅ Required for JPA to work
@AllArgsConstructor // ✅ Generates a constructor with all fields
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    // ✅ Custom constructor to allow creating new users
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
