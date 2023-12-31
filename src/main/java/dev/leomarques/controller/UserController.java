package dev.leomarques.controller;

import java.net.URI;
import java.util.List;

import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import dev.leomarques.entities.User;
import dev.leomarques.services.UserServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/users")
@Tag(name = "Usuários", description = "Endpoint para o controle usuários")
public class UserController {

    @Autowired
    private UserServices serv;

    @GetMapping
    @Operation(summary = "Procurando todos os usuários", description = "Procurando todos os usuários", tags = {"Users"})
        public ResponseEntity<List<User>> findAll(){
        List<User> list = serv.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    @Operation(summary = "Procurando usuário por id", description = "Procurando usuário por id", tags = {"Users"})
    	public ResponseEntity<User> findById(@PathVariable Long id) {
        User user = serv.findById(id);
        return ResponseEntity.ok().body(user);
    }

    @PostMapping
    @Operation(summary = "Criando um usuario", description = "Criando um usuario", tags = {"Users"})
    public ResponseEntity<User> insert(@RequestBody User obj) {
        obj = serv.create(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @PutMapping(value = "/{id}")
    @Operation(summary = "Atualizando um usuário", description = "Atualizando um usuário", tags = {"Users"})
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User obj){
        obj = serv.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletando por id", description = "Deletando por id", tags = {"Users"})
    public ResponseEntity<User> deletar(@PathVariable @NotNull Long id) {
        serv.deletar(id);
        return ResponseEntity.noContent().build();
    }
}

