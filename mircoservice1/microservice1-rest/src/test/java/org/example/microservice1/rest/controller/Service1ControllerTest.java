package org.example.microservice1.rest.controller;

import org.example.microservice1.Microservice1Application;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = Microservice1Application.class)
class Service1ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void given_when_thenStatus200() throws Exception {
        var resultActions = post("/api/service1/", HttpStatus.OK);
        resultActions.andExpect(MockMvcResultMatchers.status().isOk());
    }

    private ResultActions post(String urlTemplate, HttpStatus httpStatus) throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post(urlTemplate);

        final ResultActions perform = mockMvc.perform(requestBuilder);
        return perform.andExpect(MockMvcResultMatchers.status().is(httpStatus.value()));
    }
}
