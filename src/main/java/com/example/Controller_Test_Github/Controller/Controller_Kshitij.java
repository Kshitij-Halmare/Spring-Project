package com.example.Controller_Test_Github.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kshitij")
public class Controller_Kshitij {
    @GetMapping("/")
    public String BaseFuncion(){
        return "Hello My name is Kshitij Halmare";
    }
}
