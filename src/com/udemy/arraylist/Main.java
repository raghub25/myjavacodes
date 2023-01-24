package com.udemy.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone phone = new MobilePhone();
    private static String name,phno;

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    phone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                    break;
//                case 6:
//                    processArrayList();
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact to the list.");
        System.out.println("\t 3 - To modify a contact in the list.");
        System.out.println("\t 4 - To remove a contact from the list.");
        System.out.println("\t 5 - To search for a contact in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addContact() {
        System.out.print("Enter the name of the contact:");
        name=scanner.nextLine();
        System.out.print("Enter the phone number of contact:");
        phno=scanner.nextLine();
        Contacts contact = new Contacts(name,phno);
        phone.addContact(contact);
    }

    public static void modifyContact() {
        System.out.print("Current contact details: ");
        System.out.print("Enter the name of the contact:");
        String currentName=scanner.nextLine();
        System.out.print("Enter the phone number of contact:");
        String currentPhno=scanner.nextLine();
        System.out.print("Enter new contact details: ");
        System.out.print("Enter the name of the contact:");
        String newName=scanner.nextLine();
        System.out.print("Enter the phone number of contact:");
        String newPhno=scanner.nextLine();
        phone.modifyContact(currentName,currentPhno,newName,newPhno);
    }

    public static void removeContact() {
        System.out.print("Enter contact details: ");
        Contacts contact = new Contacts(scanner.nextLine(), scanner.nextLine());
        phone.removeContact(contact);
    }

    public static void searchForContact() {
        System.out.print("Contact to search for: ");
        Contacts contact = new Contacts(scanner.nextLine(), scanner.nextLine());
        if(phone.isContactExists(contact)) {
            System.out.println("Found " + contact.getName());
        } else {
            System.out.println(contact.getName() + ", not on file.");
        }
    }

//    public static void processArrayList() {
//        ArrayList<String> newArray = new ArrayList<String>();
//        newArray.addAll(groceryList.getGroceryList());
//
//        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
//
//        String[] myArray = new String[groceryList.getGroceryList().size()];
//        myArray = groceryList.getGroceryList().toArray(myArray);
//
//
//    }

}
