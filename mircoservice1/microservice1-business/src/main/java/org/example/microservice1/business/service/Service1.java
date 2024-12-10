package org.example.microservice1.business.service;

import org.springframework.stereotype.Service;


@Service
public class Service1 {

    public String microservice1Unit() {
        return "Microservice1 unit";
    }

    public String microservice1Integration() {
        return "Microservice1 integration";
    }

    public String microservice1CucumberIntegration() {
        return "Microservice1 cucumber integration";
    }
}
