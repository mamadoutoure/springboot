package com.example.pringexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld
{
    private String test;
    @GetMapping("/")
    public String Home()  {
        return "Hello from Spring Boot";
    }
}
