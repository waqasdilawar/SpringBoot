package com.boot.dasboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DealerController {
    @RequestMapping("/dealer")
    public String index(){
        return "Dealer yo you";
    }
}
