package dev.leomarques.services;

import dev.leomarques.entities.Order;
import dev.leomarques.entities.User;
import dev.leomarques.repository.OrderRepository;
import dev.leomarques.repository.UserRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
@Tag(name = "Pedidos", description = "Endpoint para o controle de pedidos")
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
