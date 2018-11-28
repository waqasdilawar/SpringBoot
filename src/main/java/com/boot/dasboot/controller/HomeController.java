package com.boot.dasboot.controller;

import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/home")
    public String post(@RequestBody String message){
        return message;
    }
}
