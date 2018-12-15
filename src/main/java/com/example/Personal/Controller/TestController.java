package com.example.Personal.Controller;

import com.example.Personal.Model.Blog;
import com.example.Personal.Repositories.BlogRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    BlogRespository blogRespository;

    @GetMapping("/test")
    public List<Blog> index(){
        return blogRespository.findAll();
    }
}
