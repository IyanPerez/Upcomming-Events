package com.sala78.upcommingevents.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity @Table(name = "users")
public class User {

   

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_user")
    private Long id_user;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;
    
    public User() {}

    public User(Long id_user, String username, String password) {
        this.id_user = id_user;
        this.username = username;
        this.password = password;
        this.roles = new ArrayList<>();
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @ManyToMany
    @JoinColumn(name="id_role", nullable = true)
    private List<User> roles;

    public List<User> getRoles() {
        return roles;
    }

    public void setRoles(List<User> roles) {
        this.roles = roles;
    }
    
    
}
