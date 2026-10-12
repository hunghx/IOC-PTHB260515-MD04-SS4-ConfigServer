package com.example;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class ApiController {
    private final ServiceCFeignClient feignClient;
    @GetMapping
    public String test(){
        return feignClient.demo();
    }
    @GetMapping("/call-data")
    public Map<?,?> callData(){
        return feignClient.abc();
    }
}
