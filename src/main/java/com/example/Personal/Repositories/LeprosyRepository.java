package com.example.Personal.Repositories;

import com.example.Personal.Model.Leprosy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LeprosyRepository extends JpaRepository<Leprosy, Integer> {
    // custom query to search to blog post by title or content
    //List<Blog> findByTitleContainingOrContentContaining(String text, String textAgain);
    Leprosy findById(int Id);
    List<Leprosy> findByname(String name);
    List<Leprosy> findBydob(String dob);
}
