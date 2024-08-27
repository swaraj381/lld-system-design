package org.designpattern.solidprinciples.srp.models;

import java.util.List;

public class Order {
    private  Customer customer;
    List<String> items;

    public Order(Customer customer, List<String> items) {
        this.customer = customer;
        this.items = items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}
