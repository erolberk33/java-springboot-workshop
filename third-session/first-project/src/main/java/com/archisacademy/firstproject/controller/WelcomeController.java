package com.archisacademy.firstproject.controller;

import com.archisacademy.firstproject.service.WelcomeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    private final WelcomeService welcomeService;

    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }
    
    @PostMapping
    public String getMessage(@RequestBody String name){
        return welcomeService.gratings(name);
    }
}
