package org.example.microservice1.rest.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@ExtendWith(SpringExtension.class)
class Service1ControllerTest extends AbstractControllerTest {

    @Test
    void given_when_thenStatus200() throws Exception {
        var resultActions = post("/api/service1/", HttpStatus.OK);
        resultActions.andExpect(MockMvcResultMatchers.status().isOk());
    }
}
