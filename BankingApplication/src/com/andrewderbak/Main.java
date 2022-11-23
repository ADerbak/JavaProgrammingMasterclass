package com.andrewderbak;

public class Main {

    public static void main(String[] args) {
        // create simple banking application
        // There should be a Bank Class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the arraylist of doubles
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new bracnh
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list of
        // their transactions
        // Deomonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

//        Bank bank = new Bank("Andrew's Bank");
//        bank.addBranch("North");
//        bank.addCustomer("North", "Andrew", 1000.51);
//        bank.listCustomers("North", true);
//        bank.addCustomerTransaction("North", "Andrew", 500.00);
//        bank.listCustomers("North", true);
//        bank.listCustomers("North", false);

        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);

    }

}
