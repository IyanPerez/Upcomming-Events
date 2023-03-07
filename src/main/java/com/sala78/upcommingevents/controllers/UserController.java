package com.sala78.upcommingevents.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
