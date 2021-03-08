package com.zem.onlineshop.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class LoginRestController {

    @GetMapping("/")
    public String sayHello(){
        return "heloo" + LocalDateTime.now();
    }
}
