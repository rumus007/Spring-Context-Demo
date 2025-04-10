package org.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingController2 {

    @Autowired
    private GreetingService greetingService;

    public void deliverGreeting(){
        System.out.println(greetingService.greetings());
    }
}
