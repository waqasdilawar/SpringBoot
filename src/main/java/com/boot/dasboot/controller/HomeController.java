package com.boot.dasboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return  "Das, reporting for body";
    }
    @GetMapping("/home")
    public String get(){
        return "Idea";
    }
}
