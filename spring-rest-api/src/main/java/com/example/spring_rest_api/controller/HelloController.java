package com.example.spring_rest_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/message")
    public String message() {
        return "Spring Boot Hello";
    }
}
