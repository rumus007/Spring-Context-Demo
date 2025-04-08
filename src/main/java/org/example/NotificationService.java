package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @Autowired //Field Dependency Injection
    private EmailService emailService;

    public void notifyUser(String userEmail){
        String subject = "Welcome!";
        String body = "Thank you for registering with our services.";
        emailService.sendEmail(userEmail, subject, body);
    }
}
