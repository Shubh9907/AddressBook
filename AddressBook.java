package com.bridgelabz;

public class AddressBook {
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
