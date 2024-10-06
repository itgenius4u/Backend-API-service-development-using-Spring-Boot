package com.example.spring_rest_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_rest_api.service.HelloService;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    @GetMapping("/message")
    public String message() {
        helloService.setMessage("안녕하세요.");
        return "Spring Boot Hello "
            + helloService.getMessage();
    }
}
