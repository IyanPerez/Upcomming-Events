package com.sala78.upcommingevents.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sala78.upcommingevents.models.User;

public interface UserRepository extends JpaRepository<User,Long>  {
    public Optional<User> findByUsername(String username);
}
