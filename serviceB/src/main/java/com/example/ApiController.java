package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiController {
    @Value("${user.name}")
    public String name;
    @Value("${user.age}")
    public int age;

    @GetMapping
    public String test(){
        return "Name : "+name +" age :" +age;
    }
    @GetMapping("/api/service-b/data")
    public Map<?,?> getData(){
        Map<String , Object> map = new HashMap<>();
        map.put("name","Ho Xuan Hung");
        map.put("age",100);
        return map;
    }
 }
