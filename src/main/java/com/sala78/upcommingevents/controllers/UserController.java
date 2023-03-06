package com.sala78.upcommingevents.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sala78.upcommingevents.models.User;
import com.sala78.upcommingevents.services.ServiceUser;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {
    
    private ServiceUser service;

    public UserController(ServiceUser service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<User> listAll() {
        return service.listAll();
    }

    @GetMapping("/{id_user}")
    public ResponseEntity<User> findById(@PathVariable Long id_user) {
        User newUser = service.findById(id_user);
        if (newUser != null) {
            return ResponseEntity.ok(newUser);
        } else {
            return ResponseEntity.notFound().build();
        }

    }
    @PostMapping(value = "")
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<?> store(@RequestBody User newUser) {

        try {
            return ResponseEntity.ok(service.save(newUser));
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error");
        }
    }
}

    

