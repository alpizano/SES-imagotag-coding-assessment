package com.sesimagotag.training.demo.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetHelloController {

    /**
     * GET hello request
     */
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getHello() {
        return "Greetings from Spring Boot!";
    }

}
