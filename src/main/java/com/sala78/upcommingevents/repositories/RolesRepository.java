package com.sala78.upcommingevents.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sala78.upcommingevents.models.Role;

public interface RolesRepository extends JpaRepository<Role, Long>{
    
}
