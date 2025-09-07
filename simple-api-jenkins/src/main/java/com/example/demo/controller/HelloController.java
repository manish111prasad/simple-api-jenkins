package com.example.demo.controller;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public Map<String, Object> hello() {
        Map<String, Object> resp = new HashMap<>();
        resp.put("message", "Hello, Manish! 👋");
        resp.put("timestamp", OffsetDateTime.now().toString());
        return resp;
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        Map<String, String> resp = new HashMap<>();
        resp.put("status", "UP");
        return resp;
    }
}
