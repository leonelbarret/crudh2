package dev.leomarques.services;

import dev.leomarques.entities.User;
import dev.leomarques.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserServices {

    @Autowired
    UserRepository repo;

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Leonel", "leonel@gmail.com", "999999", "123456");
        return ResponseEntity.ok().body(u);

    }



}
