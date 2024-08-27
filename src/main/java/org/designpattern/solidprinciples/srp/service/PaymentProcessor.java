package org.designpattern.solidprinciples.srp.service;

import org.designpattern.solidprinciples.srp.models.Order;

public class PaymentProcessor {
    public void processPayment(Order order){

        //Check if order is valid
        if (isOrderValid(order)){
            // Simulate payment processing
            System.out.println("Processing payment for order with " + order.getItems().size() + " items.");
            // Simulate a successful payment
            System.out.println("Payment processed successfully for customer: " + order.getCustomer().getName());
        } else {
            System.out.println("Failed to process payment: Invalid order.");
        }
    }

    // Private helper method to validate the order
    private boolean isOrderValid(Order order){
        if (order==null || order.getCustomer()==null){
            return false;
        }
        // Ensure there are items in the order
        return !order.getItems().isEmpty();
    }

}



