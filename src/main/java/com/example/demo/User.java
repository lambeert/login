package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
@Entity
@Table(name = "users")
public class User {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String roles;

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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