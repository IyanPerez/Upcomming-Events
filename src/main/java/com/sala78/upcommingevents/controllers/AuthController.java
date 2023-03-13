package com.sala78.upcommingevents.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;


@RestController
@RequestMapping(path = "/api")
public class AuthController {

    @GetMapping(value = "/login")
    public ResponseEntity<Map<String,String>> access(){
        var auth = SecurityContextHolder.getContext().getAuthentication();

        String sessionId = RequestContextHolder.getRequestAttributes().getSessionId();

        Map<String, String> json = new HashMap<>();
        json.put("message","Logged");
        json.put("username", auth.getName());
        json.put("JSESSIONID", sessionId);
        json.put("role", auth.getAuthorities().iterator().next().toString());

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(json);
    }

    
}
