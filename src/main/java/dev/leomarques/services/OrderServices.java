package dev.leomarques.services;

import dev.leomarques.entities.Order;
import dev.leomarques.entities.User;
import dev.leomarques.repository.OrderRepository;
import dev.leomarques.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServices {

    @Autowired
    OrderRepository repo;

    @GetMapping
    public List<Order> findAll(){
        return repo.findAll();
    }


    @GetMapping(value = "/{id}")
    public Order findById(Long id){
        Optional<Order> obj = repo.findById(id);
        return obj.get();

    }





}
