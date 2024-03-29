package com.andrewderbak;

import java.util.Scanner;

public class MobilePhone {

    private static Scanner in = new Scanner(System.in);
    private static Contacts contacts = new Contacts();

    public static void main(String[] args) {

        printHello();
        int choice = 0;
        while (choice != 5) {
            printMenu();
            choice = in.nextInt();
            in.nextLine();
            optionsMenu(choice);

        }
    }

    public static void printHello(){
        System.out.println("Hello! Welcome to your mobile phone.");
    }

    public static void printMenu(){
        System.out.println("What would you like to do?:");
        System.out.println("1. Print contacts");
        System.out.println("2. Add new contact");
        System.out.println("3. Update existing contact");
        System.out.println("4. Remove contact");
        System.out.println("5. Quit");
    }

    public static void optionsMenu(int choice){
        switch(choice) {
            case 1:
                contacts.printContacts();
                break;
            case 2:
                contacts.addNewContact();
                break;
            case 3:
                contacts.changeContact();
                break;
            case 4:
                contacts.removeContact();
                break;
            case 5:
                System.out.println("Shutting down...");
                break;

            default:
                System.out.println("Invalid option. Try again");
                break;
        }
    }

}
