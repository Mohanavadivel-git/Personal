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
        Leprosy LeprosyUpdate = LeprosyRespository.findById(LeprosyId);
        LeprosyUpdate.id=LeprosyId;
        LeprosyUpdate.state=body.state;
        LeprosyUpdate.district=body.district;
        LeprosyUpdate.healthfacility=body.healthfacility;
        LeprosyUpdate.name=body.name;
        LeprosyUpdate.dob=body.dob;
        LeprosyUpdate.gender=body.gender;
        LeprosyUpdate.phonenumber=body.phonenumber;
        LeprosyUpdate.address=body.address;
        LeprosyUpdate.leprosytype=body.leprosytype;
        LeprosyUpdate.identifiedtime= body.identifiedtime;
        LeprosyUpdate.disabilitystatus=body.disabilitystatus;
        LeprosyUpdate.reactiontype=body.reactiontype;
        LeprosyUpdate.dose40mg=body.dose40mg;
        LeprosyUpdate.dose30mg=body.dose30mg;
        LeprosyUpdate.dose20mg=body.dose20mg;
        LeprosyUpdate.dose15mg=body.dose15mg;
        LeprosyUpdate.dose10mg=body.dose10mg;
        LeprosyUpdate.dose5mg=body.dose5mg;
        LeprosyUpdate.otherdrugs=body.otherdrugs;
        LeprosyUpdate.treatmentcomplete=body.treatmentcomplete;
        LeprosyUpdate.personstatus=body.personstatus;
        LeprosyUpdate.remarks=body.remarks;
        return LeprosyRespository.save(LeprosyUpdate);
    }

    @DeleteMapping("Leprosy/{id}")
    public boolean delete(@PathVariable String id){
        int LeprosyId = Integer.parseInt(id);
        LeprosyRespository.deleteById(LeprosyId);
        return true;
    }
}
