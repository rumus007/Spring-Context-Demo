package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        for(String beanName : context.getBeanDefinitionNames()){
            System.out.println(beanName);
        }

        NotificationService notificationService = context.getBean(NotificationService.class);
        notificationService.notifyUser("user@example.com");
    }
}