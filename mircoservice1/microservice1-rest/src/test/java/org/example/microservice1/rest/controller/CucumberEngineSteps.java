package org.example.microservice1.rest.controller;

import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.example.microservice1.business.service.Service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@CucumberContextConfiguration()
public class CucumberEngineSteps extends AbstractControllerTest {

    @Autowired
    private Service1 service1;

    @When("call service1 controllerMethod cucumber")
    public void call_service1_controllerMethod_cucumber() throws Exception {
        var resultActions = post("/api/service1/cucumber", HttpStatus.OK);
        resultActions.andExpect(MockMvcResultMatchers.status().isOk());
    }

    @When("call service1 serviceMethod cucumber")
    public void call_service1_serviceMethod_cucumber() {
        service1.microservice1Cucumber();
    }
}
