package org.example.microservice1.rest.controller;

import org.example.microservice1.business.service.Service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/service1")
@RestController
public class Service1Controller {

    @Autowired
    private Service1 service1;

    @PostMapping("/")
    public String service1Integration() {
        return service1.microservice1Integration();
    }
}
