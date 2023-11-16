package dev.leomarques.controller;

import dev.leomarques.entities.User;
import dev.leomarques.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserServices serv;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = serv.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User user = serv.findById(id);
        return ResponseEntity.ok().body(user);
    }
}
