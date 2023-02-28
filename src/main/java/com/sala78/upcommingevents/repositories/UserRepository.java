package com.sala78.upcommingevents.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sala78.upcommingevents.models.User;

public interface UserRepository extends JpaRepository <User,Long>  {
    
}
