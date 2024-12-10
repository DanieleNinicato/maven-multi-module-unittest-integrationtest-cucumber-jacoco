package org.example.microservice1.rest.controller;

import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.example.microservice1.Microservice1Application;
import org.example.microservice1.business.service.Service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@CucumberContextConfiguration()
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = {Microservice1Application.class})
public class CucumberEngineSteps {
    @Autowired
    private Service1 service1;

    @When("call service1 POST cucumber")
    public void call_service1_POST_cucumber() {
        service1.microservice1CucumberIntegration();
    }
}
