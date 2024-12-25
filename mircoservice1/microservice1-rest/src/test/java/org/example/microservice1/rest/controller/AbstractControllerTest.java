package org.example.microservice1.rest.controller;

import org.example.microservice1.Microservice1Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = Microservice1Application.class)
public class AbstractControllerTest {

    @Autowired
    private MockMvc mockMvc;

    protected ResultActions post(String urlTemplate, HttpStatus httpStatus) throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post(urlTemplate);

        final ResultActions perform = mockMvc.perform(requestBuilder);
        return perform.andExpect(MockMvcResultMatchers.status().is(httpStatus.value()));
    }
}
