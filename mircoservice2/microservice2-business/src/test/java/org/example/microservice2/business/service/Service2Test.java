package org.example.microservice2.business.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Service2Test {

    private Service2 service2;

    @BeforeEach
    void init() {
        service2 = new Service2();
    }

    @Test
    void test_notNul() {
        assertNotNull(service2);
    }

    @Test
    void test_microservice2Unit() {
        assertEquals("Microservice2 unit", service2.microservice2Unit());
    }
}
