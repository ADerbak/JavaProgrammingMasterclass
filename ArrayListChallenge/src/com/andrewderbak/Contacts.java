package com.andrewderbak;

import java.util.ArrayList;

public class Contacts {
    private static ArrayList<String> names = new ArrayList<String>();
    private static ArrayList<String> numbers = new ArrayList<String>();

    public static void printContacts(){
        for (int i = 0; i < names.size(); i++){
            System.out.println(i + ". " + names.get(i) + ": "+ numbers.get(i));
        }
    }

    public static void addNewContact(String name, String number) {
        if (names.contains(name) || numbers.contains(number)) {
            System.out.println("Contact already in phone!");
        } else {
            names.add(name);
            numbers.add(number);
            System.out.println(name + ": "+ number + " added to contacts!");
        }
    }

    public static void changeContactName(String oldName, String newName){
        if (!names.contains(oldName)) {
            System.out.println("Contact not in phone!");
        } else{

            int index = findContact(oldName);
            names.set(index, newName);
        }
    }

    public static void changeContactNumber(String oldNumber, String newNumber){
        if (!numbers.contains(oldNumber)) {
            System.out.println("Contact not in phone!");
        } else{

            int index = findContact(oldNumber);
            numbers.set(index, newNumber);
        }
    }

    public static void removeContact(String name){
        if (!names.contains(name)) {
            System.out.println("Contact not in phone!");
        } else{

            int index = findContact(name);
            names.remove(index);
        }
    }

    private static int findContact(String name){
        if (names.contains(name)){
            return names.indexOf(name);
        } else {
            return -1;
        }
    }

}
