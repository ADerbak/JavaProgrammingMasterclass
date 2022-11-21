package com.andrewderbak;

import java.util.ArrayList;

public class Contacts {
    private ArrayList<String> names = new ArrayList<String>();
    private ArrayList<String> numbers = new ArrayList<String>();

    public void addNewContact(String name, String number) {
        if (names.contains(name) || numbers.contains(number)) {
            System.out.println("Contact already in phone00");
        } else {
            names.add(name);
            numbers.add(number);
            System.out.println(name + ": "+ number + " added to contacts!");
        }
    }

}
