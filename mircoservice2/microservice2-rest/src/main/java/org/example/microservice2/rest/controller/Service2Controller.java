package org.example.microservice2.rest.controller;

import org.example.microservice2.business.service.Service2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/service2")
@RestController
public class Service2Controller {

    @Autowired
    private Service2 service2;

    @PostMapping("/")
    public String service1Integration() {
        return service2.microservice2Integration();
    }
}
