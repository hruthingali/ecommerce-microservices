package com.example.order;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // ✅ Use "application-test.yml" during tests
class OrderApplicationTests {

    @Test
    void contextLoads() {
    }
}
