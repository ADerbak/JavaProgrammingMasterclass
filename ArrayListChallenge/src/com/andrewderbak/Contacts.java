package com.andrewderbak;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {

    static Scanner in = new Scanner(System.in);

    private static ArrayList<String> names = new ArrayList<String>();
    private static ArrayList<String> numbers = new ArrayList<String>();

    public static void printContacts(){
        System.out.println("Contacts in phone:");
        for (int i = 0; i < names.size(); i++){
            System.out.println(i+1 + ". " + names.get(i) + ": "+ numbers.get(i));
        }
        System.out.println("");
    }

    public static void addNewContact() {
        String name, number;
        System.out.println("Enter in name:");
        name = in.nextLine();
        System.out.println("Enter in number:");
        number = in.nextLine();

        if (names.contains(name) || numbers.contains(number)) {
            System.out.println("Contact already in phone!");
        } else {
            names.add(name);
            numbers.add(number);
            System.out.println(name + ": "+ number + " added to contacts!");
        }
    }

    public static void changeContact(){
        System.out.println("Which contact would you like to change?:");
        String oldName = in.nextLine();
        int index = findContact(oldName);
        System.out.println("Which would you like to change - Name or Number?:");
        System.out.println("1.Name");
        System.out.println("2.Number");
        int choice = in.nextInt();
        in.nextLine();
        switch(choice) {
            case 1:
                System.out.println("Enter in new name:");
                String newName = in.nextLine();
                changeContactName(oldName, newName);
                break;
            case 2:
                System.out.println("Enter in new number:");
                String newNumber = in.nextLine();
                changeContactNumber(numbers.get(index), newNumber);
                break;
            default:
                System.out.println("Invalid Option! Try again.\n");
        }
    }

    public static void changeContactName(String oldName, String newName){
        if (!names.contains(oldName)) {
            System.out.println("Contact not in phone!\n");
        } else{

            int index = findContact(oldName);
            names.set(index, newName);
        }
    }

    public static void changeContactNumber(String oldNumber, String newNumber){
        if (!numbers.contains(oldNumber)) {
            System.out.println("Contact not in phone!\n");
        } else{

            int index = findContact(oldNumber);
            numbers.set(index, newNumber);
        }
    }

    public static void removeContact(){
        System.out.println("Which contact would you like to remove?:");
        String name = in.nextLine();
        if (!names.contains(name)) {
            System.out.println("Contact not in phone!\n");
        } else{
            int index = findContact(name);
            names.remove(index);
            numbers.remove(index);
        }
    }

    private static int findContact(String name) {
        if (names.contains(name)) {
            return names.indexOf(name);
        } else if (numbers.contains(name)) {
            return numbers.indexOf(name);
        }else {
            return -1;
        }
    }

}
