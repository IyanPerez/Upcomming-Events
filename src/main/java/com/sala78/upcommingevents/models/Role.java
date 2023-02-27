package com.sala78.upcommingevents.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Role {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name="id_role")
    private Long id_role;

    @Column(nullable = false)
    private String role;
    
    public Role() {}

    public Role(Long id_roles, String role) {
        this.id_role = id_roles;
        this.role = role;
    }

    public Long getId_roles() {
        return id_role;
    }

    public void setId_roles(Long id_roles) {
        this.id_role = id_roles;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    
    
}
