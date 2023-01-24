package com.udemy.arraylist.boxing;
//2.Branch
//
//          - It has two fields, A String called name and an ArrayList that holds objects of type Customer called customers.
//
//          - A constructor that takes a String (name of the branch). It initialises name and instantiates customers.
//
//          - And five methods, they are (their functions are in their names):
//
//            - getName(), getter for name.
//
//            - getCustomers(), getter for customers.
//
//            - newCustomer(), has two parameters of type String (name of customer), double (initial transaction) and
//            returns a boolean. Returns true if the customer was added successfully or false otherwise.
//
//            - addCustomerTransaction(), has two parameters of type String (name of customer), double (transaction) and returns a
//            boolean. Returns true if the customers transaction was added successfully or false otherwise.
//
//            - findCustomer(), has one parameter of type String (name of customer) and returns a Customer. Return the Customer if they
//            exist, null otherwise.

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double transaction) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, transaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if (customer != null) {
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
