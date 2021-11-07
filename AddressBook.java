package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contacts> contact_Details = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public void addContacts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Contact Details");
        System.out.println("Enter the first name");
        String firstName = sc.next();
        System.out.println("Enter the Last name");
        String lastName = sc.next();
        System.out.println("Enter the address");
        String address = sc.next();
        System.out.println("Enter the city ");
        String city = sc.next();
        System.out.println("Enter the state ");
        String state = sc.next();
        System.out.println("Enter the Email Id ");
        String emailId = sc.next();
        System.out.println("Enter the Pin Code ");
        int zipCode = sc.nextInt();
        System.out.println("Enter phone number ");
        int phoneNumber = sc.nextInt();
        System.out.println("Contact saved");
        Contacts details = new Contacts(firstName, lastName, address, city, state, emailId, zipCode, phoneNumber);
        contact_Details.add(details);
    }

    public void editContacts(String name) {
        for (Contacts contact : contact_Details) {
            if (name.equalsIgnoreCase(contact.getFirstName())) {
                System.out.println("Edit the first name");
                String firstName = sc.next();
                contact.setFirstName(firstName);
                System.out.println("Edit the last name");
                String lastName = sc.next();
                contact.setLastName(lastName);
                System.out.println("Edit the address");
                String address = sc.next();
                contact.setAddress(address);
                System.out.println("Edit the city");
                String city = sc.next();
                contact.setCity(city);
                System.out.println("Edit the state");
                String state = sc.next();
                contact.setState(state);
                System.out.println("Edit the email Id");
                String emailId = sc.next();
                contact.setEmailId(emailId);
                System.out.println("Edit the Pin Code");
                int zipcode = sc.nextInt();
                contact.setZipCode(zipcode);
                System.out.println("Edit the Phone Number");
                long phoneNumber = sc.nextInt();
                contact.setPhoneNumber(phoneNumber);
            } else
                System.out.println("Contact not found");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
    }
}
class Contacts {
    private String firstName, lastName;
    private String address, city, state;
    private String email;
    private int pinCode;
    private long phoneNumber;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmailId() {
        return email;
    }

    public void setEmailId(String emailId) {
        this.email = emailId;
    }

    public int getZipCode() {
        return pinCode;
    }

    public void setZipCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contacts(String firstName, String lastName, String address, String city, String state, String email, int pinCode, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.pinCode = pinCode;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return
                "FirstName  =  " + firstName +"\nLastName   =  " + lastName +"\nAddress    =  " + address + "\nCity       =  " + city +
                "\nState      =  " + state + "\nZipCode    =  " + pinCode + "\nNumber     =  " + phoneNumber + "\nEmail      =  " + email;
    }
}
