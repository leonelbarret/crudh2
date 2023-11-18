package dev.leomarques.controller;

import dev.leomarques.entities.Category;
import dev.leomarques.entities.Order;
import dev.leomarques.services.CategoryServices;
import dev.leomarques.services.OrderServices;
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
@RequestMapping(value = "/categories")
@Tag(name = "Categorias", description = "Endpoint para o controle de categorias")
public class CategoryController {

    @Autowired
    private CategoryServices serv;

    @GetMapping
    @Operation(summary = "Procurando todas as categorias", description = "Procurando todas as categorias", tags = {"Categorias"})
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = serv.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    @Operation(summary = "Procurando categorias por id", description = "Procurando categorias por id", tags = {"Categorias"})
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category category = serv.findById(id);
        return ResponseEntity.ok().body(category);
    }
}
