package com.sala78.upcommingevents.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity @Table(name = "users")
public class User {

    @ManyToMany
    private List<User> roles;

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

    
    
}