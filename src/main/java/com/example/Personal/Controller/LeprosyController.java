package com.example.Personal.Controller;
import com.example.Personal.Model.Leprosy;
import com.example.Personal.Repositories.LeprosyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class LeprosyController {

    @Autowired
    LeprosyRepository LeprosyRespository;

    @GetMapping("/Leprosy")
    public List<Leprosy> index(){
        return LeprosyRespository.findAll();
    }

    @GetMapping("/Leprosy/{id}")
    public Leprosy show(@PathVariable String id){
        int LeprosyId = Integer.parseInt(id);
        //return blogRespository.findOne(blogId);
        return LeprosyRespository.findById(LeprosyId);
    }
/*
    @PostMapping("/Leprosy/search")
    public List<Leprosy> search(@RequestBody Map<String, String> body){
        String searchTerm = body.get("text");
        return LeprosyRespository.findByTitleContainingOrContentContaining(searchTerm, searchTerm);
    }*/

    @PostMapping("/Leprosy")
    public Leprosy create(@RequestBody Leprosy body){
        //String title = body.get("title");
        //String content = body.get("content");
        return LeprosyRespository.save(body);
    }

    @PutMapping("/Leprosy/{id}")
    public Leprosy update(@PathVariable String id, @RequestBody Leprosy body){
        int LeprosyId = Integer.parseInt(id);
        // getting blog
        Leprosy Leprosy = LeprosyRespository.findById(LeprosyId);
        Leprosy.state=body.state;
        return LeprosyRespository.save(body);
    }

    @DeleteMapping("Leprosy/{id}")
    public boolean delete(@PathVariable String id){
        int LeprosyId = Integer.parseInt(id);
        LeprosyRespository.deleteById(LeprosyId);
        return true;
    }
}
