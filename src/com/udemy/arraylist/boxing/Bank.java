package com.udemy.arraylist.boxing;
//1. Bank
//
//        - It has two fields, A String called name and an ArrayList that holds objects of type Branch called branches.
//
//        - A constructor that takes a String (name of the bank). It initialises name and instantiates branches.
//
//        - And five methods, they are (their functions are in their names):
//
//          - addBranch(), has one parameter of type String (name of the branch) and returns a boolean.
//          It returns true if the branch was added successfully or false otherwise.
//
//          - addCustomer(), has three parameters of type String (name of the branch), String (name of the customer),
//          double (initial transaction) and returns a boolean. It returns true if the customer was added successfully or false otherwise.
//
//          - addCustomerTransaction(), has three parameters of type String (name of the branch), String (name of the customer),
//          double (transaction) and returns a boolean. It returns true if the customers transaction was added successfully or false otherwise.
//
//          - findBranch(), has one parameter of type String (name of the Branch) and returns a Branch. Return the Branch if it
//          exists or null otherwise.
//
//          - listCustomers(), has two parameters of type String (name of the Branch), boolean (print transactions) and returns a boolean.
//          Return true if the branch exists or false otherwise. This method prints out a list of customers.

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean isTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> customers = branch.getCustomers();
            for (int i = 0; i < customers.size(); i++) {
                Customer customer = customers.get(i);
                System.out.println("Customer: " + customer.getName() + "[" + (i + 1) + "]");
                if (isTransaction) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        double transaction = transactions.get(j);
                        System.out.println("[" + (j + 1) + "]  Amount " + transaction);
                    }
                }
            }
            return true;
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }
}
