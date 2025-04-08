package org.example;

public class NotificationService {
    private final EmailService emailService;

    // Constructor Dependency injection
    public  NotificationService(EmailService emailService){
        this.emailService = emailService;
    }

    public void notifyUser(String userEmail){
        String subject = "Welcome!";
        String body = "Thank you for registering with our services.";
        emailService.sendEmail(userEmail, subject, body);
    }
}
