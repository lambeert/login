package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String Boombom(){
        return "<h1> Welcome </h1>";
    }
    @GetMapping("/admin")
    public String Boombom1(){
        return "<h1> Welcome ADMIN</h1>";
    }
    @GetMapping("/user")
    public String Boombom2(){
        return "<h1> Welcome user</h1>";
    }

}
