package com.udemy.arraylist;
// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> contacts;

    public MobilePhone(){
        this.contacts=new ArrayList<>();
    }

    public void printContacts() {
        System.out.println("You have " + contacts.size() + " contacts in your phone");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ". " + contacts.get(i).toString());
        }
    }

    public void addContact(Contacts contact) {
        if (!isContactExists(contact)) {
            contacts.add(contact);
        }
        else{
            System.out.println("Contact already exists");
        }
    }

    public void modifyContact(Contacts existingContact, Contacts newContact) {
        int position = findContact(existingContact);
        if (isContactExists(existingContact)) {
            modifyContact(position, newContact);
            System.out.println("Contact updated");
        }
        else {
            System.out.println("Cannot be modified");
        }
    }
    public void modifyContact(String currentName,String currentPhno,String newName,String newPhno){
        Contacts existingContact = new Contacts(currentName,currentPhno);
        Contacts newContact = new Contacts(newName,newPhno);
        modifyContact(existingContact,newContact);
    }

    private void modifyContact(int position, Contacts newContact) {
        contacts.set(position, newContact);
        System.out.println("Contact at position " + (position + 1) + " has been modified");
    }

    public void removeContact(Contacts contact) {
        int position = findContact(contact);
        if (isContactExists(contact)) {
            removeContact(position);
        }
    }

    private void removeContact(int position) {
        contacts.remove(position);
    }

    public boolean isContactExists(Contacts contact) {
        int position = findContact(contact);
        if (position >= 0) {
            return true;
        } else {
            return false;
        }
    }

    private int findContact(Contacts contact) {
        return contacts.indexOf(contact);
    }
}
