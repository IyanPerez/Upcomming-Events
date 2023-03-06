package com.sala78.upcommingevents.services;

import java.util.List;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sala78.upcommingevents.models.User;
import com.sala78.upcommingevents.repositories.UserRepository;

@Service
public class UserService {
    
    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User store(User user) {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        String encodePassword = encoder.encode(user.getPassword());

        user.setPassword(encodePassword);
        return repository.save(user);
    }

    public List<User> listAll() {
        

        return repository.findAll();
    }
}
