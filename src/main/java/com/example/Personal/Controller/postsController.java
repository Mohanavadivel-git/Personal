package com.example.Personal.Controller;

import com.example.Personal.Service.postsService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class postsController {
    @Value("url")
    private String url;
    RestTemplate restTemplate= new RestTemplate();

    @RequestMapping(value = "/posts",method = RequestMethod.GET)
    public ResponseEntity<Object> getpostdeatils() {
        return new ResponseEntity<>(postsService.getposts(), HttpStatus.OK);
    }
}
