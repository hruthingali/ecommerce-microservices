package com.example.user.services;

import com.example.user.entities.User;
import com.example.user.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

@Service  // ✅ Required for Spring Boot to detect this service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    // ✅ Constructor Injection (Preferred over `@Autowired` field injection)
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = new BCryptPasswordEncoder(); // Secure password hashing
    }

    // 🔹 Register a new user
    public User registerUser(String username, String rawPassword) {
        if (userRepository.existsByUsername(username)) {
            throw new IllegalArgumentException("Username already exists!");
        }

        String hashedPassword = passwordEncoder.encode(rawPassword);
        User user = new User(username, hashedPassword);
        return userRepository.save(user);
    }

    // 🔹 Find user by username
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    // 🔹 Validate user credentials
    public boolean authenticate(String username, String rawPassword) {
        Optional<User> userOptional = userRepository.findByUsername(username);
        return userOptional.map(user -> passwordEncoder.matches(rawPassword, user.getPassword()))
                           .orElse(false);
    }
}
