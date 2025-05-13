package com.infiniti.SpringOAuthDemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/hello")
public class HelloController {

    @GetMapping({"/", "/hello"})
    public ResponseEntity hello(){
        System.out.println("Hello Method");
        return  new ResponseEntity("Welcome to InfiniTI",HttpStatus.OK);
    }
}
