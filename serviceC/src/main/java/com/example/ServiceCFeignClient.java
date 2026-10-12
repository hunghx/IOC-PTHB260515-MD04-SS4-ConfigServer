package com.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient(name = "SERVICEB")
public interface ServiceCFeignClient {
    @GetMapping
    String demo();


    @GetMapping("/data")
    Map<?,?> abc();
}
