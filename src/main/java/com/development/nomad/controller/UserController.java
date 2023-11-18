package com.development.nomad.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Value("${config.name}")
    String name;

    @GetMapping("/hello")
    public String getUsers(){
        return "Hello from "+ name;
    }


}
