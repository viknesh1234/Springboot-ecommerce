package com.example.simpleecommerceapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController1 {

    @GetMapping("/status")
    public String home() {
        return "App deployed successfully!";
    }
}