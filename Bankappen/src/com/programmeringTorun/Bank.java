package com.programmeringTorun;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    //constructor
    public Bank(){
        customers = new ArrayList<>();
    }

    //state
    private List<Customer> customers;

    //behaviour
    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void AddAccount(long pNr){
        for( var item :customers){
            if (pNr == item.getpNr()){
                item.addAccount(new Account());
            }
        }
    }

    public List<String> getCustomers() {
        List<String> allCustomers = new ArrayList<>();
        for (var item: customers){
            allCustomers.add(item.getName());
            allCustomers.add(String.valueOf(item.getpNr()));
        }
        return allCustomers;
    }

    public List<String> printAccountInfo(long pNr){
        List<String>customerInfo = new ArrayList<>();
        for (var item :customers){
            if (pNr==item.getpNr()){
                customerInfo.add("Name: " + item.getName());
                customerInfo.add("Social security number: " + (item.getpNr()));
                customerInfo.add("Account(s): " + item.getCustomerAccounts());
            }
        }
        return customerInfo;
    }

    public void changeCustomerName(String Name, long pNr){
        for (var item:customers){
            if (pNr == item.getpNr()){
                item.setName(Name);
            }
        }
    }

    public void CloseAccount(int accIndex, long pNr){
        for (var item:customers){
            if (pNr == item.getpNr()){
                System.out.println(item.getName() + " removed account nr: "+accIndex + " Money availabe is: " + item.getTotBalance(pNr));
                item.removeAccount1(accIndex);
            }
        }
    }
    public void RemoveCustomer(long pNr){
        for (var item: customers){
            if (pNr == item.getpNr()){
                customers.remove(getCustomerIndex(pNr));
                break;
            }
            else
            {
                System.out.println("false");
            }
        }
    }

    public int getCustomerIndex(long pNr){
        int customerNum = -1;
        for (var item:customers){
            if (pNr == item.getpNr()){
                customerNum = customers.indexOf(item);
            }
        }
        return customerNum;
    }

    public void Deposit(long pNr, int indexNum, int num){
        for (var item: customers){
            if (pNr == item.getpNr()){
                item.deposit(indexNum, num);
                System.out.println(item.getName() + " deposited: " + num + " to account nr: " + indexNum);
            }
        }
    }

    public void Withdraw(long pNr, int indexNum, int num){
        for (var item: customers){
            if (pNr == item.getpNr()){
                item.withdraw(indexNum, num);
            }
        }
    }
}