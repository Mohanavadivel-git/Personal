package com.example.Personal;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello new version, %s!";

    @RequestMapping(value = "/greeting")
    @ResponseBody
    public String hello() {
        return "Hello Spring Boot";
    }
}
