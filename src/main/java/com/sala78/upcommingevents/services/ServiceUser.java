package com.sala78.upcommingevents.services;




import java.util.List;

import org.springframework.stereotype.Service;

import com.sala78.upcommingevents.models.User;

import com.sala78.upcommingevents.repositories.UserRepository;

@Service
public class ServiceUser {
    
    
    
    private UserRepository repository;
    
    public ServiceUser(UserRepository repository) {
        this.repository = repository;
    }
    
    public List<User> listAll() {
        return repository.findAll();
    }
    public User findById (long id_user) {
        return repository.findById(id_user).orElse(null);
    }
    public User save(User user) {
       User userSaved = repository.save(user);
        return userSaved;
    }
}


