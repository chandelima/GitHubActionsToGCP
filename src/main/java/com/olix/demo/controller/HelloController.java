package com.olix.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class HelloController {

    private String response = "Very well!";

    @GetMapping
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
