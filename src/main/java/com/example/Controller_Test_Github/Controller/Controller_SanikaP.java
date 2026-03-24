package com.example.Controller_Test_Github.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sanikap")
public class Controller_SanikaP {
    @GetMapping("/")
    public String getRequest(){
        return "Hello from Sanika Pohare!";
    }
}