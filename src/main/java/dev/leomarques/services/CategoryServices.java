package dev.leomarques.services;

import dev.leomarques.entities.Category;
import dev.leomarques.entities.User;
import dev.leomarques.repository.CategoryRepository;
import dev.leomarques.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServices {

    @Autowired
    CategoryRepository repo;

    @GetMapping
    public List<Category> findAll(){
        return repo.findAll();
    }


    @GetMapping(value = "/{id}")
    public Category findById(Long id){
        Optional<Category> obj = repo.findById(id);
        return obj.get();

    }





}
