package com.andrewderbak;

import java.util.Scanner;

public class MobilePhone {

    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        printHello();

        printMenu();
        optionsMenu();
    }

    public static void printHello(){
        System.out.println("Hello! Welcome to your mobile phone.");
    }

    public static void printMenu(){
        System.out.println("What would you like to do?:");
        System.out.println("1. Print contacts");
        System.out.println("2. Add new contact");
        System.out.println("3. Update existing contact");
        System.out.println("6. Remove contact");
        System.out.println("5. Quit");
    }

    public static void optionsMenu(int choice){
        Switch:
        case 1:

    }

}
