package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTemplate {
    @Value("${coach.name}")
    private String name;
    @RequestMapping("/")
    public String hi() {
        return name;
    }
}
