package org.example.microservice2.rest.controller;

import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.example.microservice2.Microservice2Application;
import org.example.microservice2.business.service.Service2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@CucumberContextConfiguration()
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = {Microservice2Application.class})
public class CucumberEngineSteps {
    @Autowired
    private Service2 service2;

    @When("call service2 POST cucumber")
    public void call_service2_POST_cucumber() {
        service2.microservice2CucumberIntegration();
    }
}
