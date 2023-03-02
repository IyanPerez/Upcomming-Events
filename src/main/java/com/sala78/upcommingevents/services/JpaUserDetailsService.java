package com.sala78.upcommingevents.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sala78.upcommingevents.models.SecurityUser;
import com.sala78.upcommingevents.repositories.UserRepository;

@Service
public class JpaUserDetailsService implements UserDetailsService{

    private UserRepository repository;

    public JpaUserDetailsService(UserRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

       
        SecurityUser user = repository.findByUsername(username)
        .map(SecurityUser::new)
        .orElseThrow(() -> new UsernameNotFoundException("username not found"+username));

        

        return user;
    }
    
}
