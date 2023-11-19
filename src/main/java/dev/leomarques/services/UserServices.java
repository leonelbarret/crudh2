package dev.leomarques.services;

import dev.leomarques.entities.User;
import dev.leomarques.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
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

    public User update(Long id, User obj){
        User entity = repo.getReferenceById(id);
        updateData(entity, obj);
        return repo.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }


    public User create(User user){
        return repo.save(user);
    }



    @DeleteMapping
    public void deletar(Long id){
        repo.deleteById(id);
    }





}
