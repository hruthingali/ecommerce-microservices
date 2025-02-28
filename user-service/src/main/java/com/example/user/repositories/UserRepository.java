package com.example.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.user.entities.User;
import java.util.Optional;

@Repository  // ✅ Required for Spring Boot to detect this repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Find user by username
    Optional<User> findByUsername(String username);

    // Check if user exists by username
    boolean existsByUsername(String username);
}
