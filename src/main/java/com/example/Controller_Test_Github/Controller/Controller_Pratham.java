package com.example.Controller_Test_Github.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pratham")
public class Controller_Pratham {
    @GetMapping("/")
    public String BaseFuncion(){
        return "This returns user data";
    }
}
