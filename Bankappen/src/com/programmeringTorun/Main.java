package com.programmeringTorun;

public class Main {

    public static void main(String[] args) {

        //instanterar bank-klassen
        Bank b = new Bank();

        //create customer 1
        b.addCustomer(new Customer("Torun", 20010309));
        // add accounts
        b.AddAccount(20010309);


        //create customer 2
        b.addCustomer(new Customer("Indy", 20150517));
        //add accounts
        b.AddAccount(20150517);


        //print all accounts
        System.out.println(b.getCustomers());


        //print account info
        System.out.println(b.printAccountInfo(20010309));
        System.out.println(b.printAccountInfo(20150517));


        //deposit money to accounts
        b.Deposit(20010309,1,600);
        b.Deposit(20150517,1,400);



        //withdraw money from accounts
        b.Withdraw(20010309,1,100);
        b.Withdraw(20150517,1,500);



        //change customer name
        b.changeCustomerName("New Torun", 20010309);
        b.changeCustomerName("New Indy", 20150517);


        //remove one account
        b.CloseAccount(1, 20010309);
        b.CloseAccount(1, 20150517);
        System.out.println(b.printAccountInfo(20010309));
        System.out.println(b.printAccountInfo(20150517));


        //remove customer + accounts
        b.RemoveCustomer(20010309);
        b.RemoveCustomer(20150517);
        System.out.println(b.printAccountInfo(20010309));
        System.out.println(b.printAccountInfo(20150517));
        System.out.println(b.getCustomers());

    }
}