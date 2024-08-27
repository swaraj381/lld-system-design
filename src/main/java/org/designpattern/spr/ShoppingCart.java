package org.designpattern;

import org.designpattern.models.Customer;
import org.designpattern.models.Order;
import org.designpattern.service.NotificationService;
import org.designpattern.service.PaymentProcessor;

import java.util.Arrays;

public class ShoppingCart {
    public static void main(String[] args) {
        // Positive Scenario
        System.out.println("===== Positive Scenario =====");
        Customer customer1 = new Customer("Alice Johnson", "alice@example.com");
        Order order1 = new Order(customer1, Arrays.asList("Laptop", "Mouse"));
        processOrder(order1, customer1);
        System.out.println();

        // Negative Scenario 1: Invalid Customer Information
        System.out.println("===== Negative Scenario 1: Invalid Customer Information =====");
        Customer customer2 = new Customer(null, null); // Invalid customer details
        Order order2 = new Order(customer2, Arrays.asList("Keyboard"));
        processOrder(order2, customer2);
        System.out.println();

        // Negative Scenario 2: Invalid Order Information
        System.out.println("===== Negative Scenario 2: Invalid Order Information =====");
        Customer customer3 = new Customer("Bob Smith", "bob@example.com");
        Order order3 = new Order(customer3, Arrays.asList()); // No items in the order
        processOrder(order3, customer3);
        System.out.println();

        // Negative Scenario 3: Null Order or Customer
        System.out.println("===== Negative Scenario 3: Null Order or Customer =====");
        Customer customer4 = null; // Null customer
        Order order4 = new Order(customer4, Arrays.asList("Monitor"));
        processOrder(order4, customer4);
        System.out.println();

        Order order5 = null; // Null order
        processOrder(order5, customer1);
        System.out.println();

        // Negative Scenario 4: Notification Failure
        System.out.println("===== Negative Scenario 4: Notification Failure =====");
        Customer customer5 = new Customer("Charlie Brown", "invalid-email"); // Invalid email address
        Order order6 = new Order(customer5, Arrays.asList("Desk"));
        processOrder(order6, customer5);
        System.out.println();
    }

    private static void processOrder(Order order, Customer customer) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(order);

        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification(customer, "Your order has been processed successfully!");
    }
}