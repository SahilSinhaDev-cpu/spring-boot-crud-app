package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {  // Fix: Added parentheses and method body
        return "Hello, Spring Boot! First try";
    }
}

