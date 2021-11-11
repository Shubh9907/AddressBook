package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        Map<String, AddressBookOperations> map = new HashMap<>();
        System.out.println("Enter Number of address book you want to add");
        int count = scan.nextInt();
        int i = 0;
        while (i < count) {
            System.out.println("Enter book name");
            String bookName = scan.next();
            AddressBookOperations addressBook = new AddressBookOperations();
            System.out.println("Enter Number of contact you want to add");
            int noCount = scan.nextInt();
            int contactCount = 1;
            while (contactCount <= noCount) {

                addressBook.add();
                contactCount++;
            }
            boolean status = true;
            do {
                System.out.println("Choose Operation you want to do");
                System.out.println("1. Add a contact\t2.Edit contact\t3.Delete a contact\t4.Exit from current address book");
                switch (scan.nextInt()) {
                    case 1:
                        addressBook.add();
                        break;
                    case 2:
                        addressBook.edit();
                        break;
                    case 3:
                        addressBook.delete();
                        break;
                    default:
                        status =false;
                }
            } while (status);
            map.put(bookName, addressBook);
            i++;
        }
        System.out.println(map);
    }
}

