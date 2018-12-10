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
    /*
    public posts getpostdeatils() {
        RestTemplate restTemplate = new RestTemplate();
        //posts trial=new posts();
        //trial.
        posts quote = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts/1", posts.class);
        return quote;
    }*/
    public ResponseEntity<Object> getpostdeatils() {
        return new ResponseEntity<>(postsService.getposts(), HttpStatus.OK);
    }


}
