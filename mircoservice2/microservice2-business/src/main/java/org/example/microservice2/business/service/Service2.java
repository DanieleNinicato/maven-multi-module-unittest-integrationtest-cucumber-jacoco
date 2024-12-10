package org.example.microservice2.business.service;

import org.springframework.stereotype.Service;


@Service
public class Service2 {

    public String microservice2Unit() {
        return "Microservice2 unit";
    }

    public String microservice2Integration() {
        return "Microservice2 integration";
    }

    public String microservice2CucumberIntegration() {
        return "Microservice2 cucumber integration";
    }
}
