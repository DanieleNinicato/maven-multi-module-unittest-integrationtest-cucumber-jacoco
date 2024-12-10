package org.example.microservice1.business.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Service1Test {

    private Service1 service1;

    @BeforeEach
    void init() {
        service1 = new Service1();
    }

    @Test
    void test_notNul() {
        assertNotNull(service1);
    }

    @Test
    void test_microservice1Unit() {
        assertEquals("Microservice1 unit", service1.microservice1Unit());
    }
}
