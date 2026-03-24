package com.example.Controller_Test_Github.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sanika")
public class ControllerSanika {

    @GetMapping("/")
    public String myFunc(){
        return "Hello, from Sanika Jain";
    }
}
