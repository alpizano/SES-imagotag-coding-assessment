package com.sesimagotag.training.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerGetHello {

    /**
     * GET hello request
     */
    @GetMapping("/")
    public String getHello() {
        return "Greetings from Spring Boot!";
    }

}
