package org.example.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class CasualGreetingService implements GreetingService{
    @Override
    public String greetings() {
        return "Hey, What's up?";
    }
}
