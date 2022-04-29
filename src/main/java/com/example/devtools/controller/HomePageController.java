package com.example.devtools.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HomePageController {
    @GetMapping("/example")
    public String example() {
        return "Hello User !!!";
    }
}
