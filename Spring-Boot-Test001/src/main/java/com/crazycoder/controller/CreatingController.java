package com.crazycoder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreatingController {
    @RequestMapping("/")
    public String greeting(){
        return "<h1> Welcome to game ................</h1>";
    }
}
