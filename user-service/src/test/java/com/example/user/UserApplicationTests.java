package com.example.user;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;  

@SpringBootTest(classes = UserApplication.class)  // ✅ Explicitly load UserApplication
@ActiveProfiles("test")  // ✅ Use test configurations
class UserApplicationTests {

    @Test
    void contextLoads() {
    }
}
