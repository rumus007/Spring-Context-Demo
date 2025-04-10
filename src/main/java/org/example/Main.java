package org.example;

import org.example.services.GreetingController;
import org.example.services.GreetingController2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        GreetingController greetingController = context.getBean(GreetingController.class);
        greetingController.deliverGreeting();

        GreetingController2 greetingController2 = context.getBean(GreetingController2.class);
        greetingController2.deliverGreeting();
    }
}