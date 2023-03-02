package com.sala78.upcommingevents.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sala78.upcommingevents.models.User;
import com.sala78.upcommingevents.services.UserService;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {
    
    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("")
    public void save(@RequestBody User user) {
        service.store(user);
    }
    @GetMapping("")
    public List<User> listAll() {
        return service.listAll();
    }
}
