package com.myapp.myapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MyController {

    @RequestMapping("/api/health")
    public String sayHello() {
        return "API health is SOO......Soooo... good";
    }

    @RequestMapping("/api/user")
    public String getUser() {
        return "Hello Friend!";
    }
}
