package dev.leomarques.services;

import dev.leomarques.entities.User;
import dev.leomarques.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    UserRepository repo;

    @GetMapping
    public List<User> findAll(){
        return repo.findAll();
    }


    @GetMapping(value = "/{id}")
    public User findById(Long id){
        Optional<User> obj = repo.findById(id);
        return obj.get();

    }





}
