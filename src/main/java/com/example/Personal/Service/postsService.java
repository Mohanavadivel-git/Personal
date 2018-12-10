package com.example.Personal.Service;

import com.example.Personal.Model.posts;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class postsService {
     public static posts getposts() {
        RestTemplate restTemplate = new RestTemplate();
        posts quote = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts/1", posts.class);
        return quote;
    }
}
