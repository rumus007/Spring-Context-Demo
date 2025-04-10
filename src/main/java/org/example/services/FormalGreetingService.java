package org.example.services;

import org.springframework.stereotype.Service;

@Service
public class FormalGreetingService implements GreetingService{
    @Override
    public String greetings() {
        return "Hello, how are you doing.";
    }
}
