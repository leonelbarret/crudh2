package dev.leomarques.controller;

import dev.leomarques.entities.Order;
import dev.leomarques.entities.User;
import dev.leomarques.services.OrderServices;
import dev.leomarques.services.UserServices;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
@Tag(name = "Pedidos", description = "Endpoint para o controle de pedidos")
public class OrderController {

    @Autowired
    private OrderServices serv;

    @GetMapping
    @Operation(summary = "Procurando todos os pedidos", description = "Procurando todos os pedidos", tags = {"Pedidos"})
    public ResponseEntity<List<Order>> findAll(){
        List<Order> list = serv.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    @Operation(summary = "Procurando pedidos por id", description = "Procurando pedidos por id", tags = {"Pedidos"})
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order order = serv.findById(id);
        return ResponseEntity.ok().body(order);
    }
}
