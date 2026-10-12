package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Value("${user.}")
    public String name;
    @Value("${user.age}")
    public int age;

    @GetMapping
    public String test(){
        return "Name : "+name +" age :" +age;
    }
 }
