package com.archisacademy.firstproject.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService{
    @Override
    public String gratings(String name) {
        return "Hello! "+name;
    }
}
