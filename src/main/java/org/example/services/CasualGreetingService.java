package org.example.services;

import org.springframework.stereotype.Service;

@Service
public class CasualGreetingService implements GreetingService{
    @Override
    public String greetings() {
        return "Hey, What's up?";
    }
}
