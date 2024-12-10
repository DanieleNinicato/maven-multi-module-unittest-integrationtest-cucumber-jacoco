package org.example.microservice1;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Microservice1ApplicationTest {

    @Test
    void contextLoads() {
        // This test will pass if the application context loads successfully.
        assertTrue(true);
    }

    @Test
    void mainMethodTest() {
        // Call the main method explicitly to cover it in the tests.
        Microservice1Application.main(new String[]{});
        assertTrue(true);
    }
}