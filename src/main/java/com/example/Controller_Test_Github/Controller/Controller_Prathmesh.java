package com.example.Controller_Test_Github.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prathmesh")
public class Controller_Prathmesh {
    @GetMapping("/")
    public String BaseFuncion(){
        return "This is made by Prathmesh.";
    }
}
