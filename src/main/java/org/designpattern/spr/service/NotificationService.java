package org.designpattern.service;

import org.designpattern.models.Customer;


public class NotificationService {
    public void sendNotification(Customer customer, String message){
        if(customer!=null || customer.getEmail()!=null || !isValidEmail(customer.getEmail())){
            sendEmailNotification(customer, message);
        } else {
            System.out.println("Unable to send notification: Customer or email is null");
        }
    }

    private boolean isValidEmail(String email) {
        // Basic email validation (could be more sophisticated)
        return email != null && email.contains("@") && email.contains(".");
    }

    private void sendEmailNotification(Customer customer, String message) {
        // Simulate sending an email notification
        System.out.println("Sending email to " + customer.getEmail() + ": " + message);
    }

    private void sendSmsNotification(Customer customer, String message) {
        // Simulate sending an SMS notification
        System.out.println("Sending SMS to " + customer.getName() + ": " + message);
    }
}
