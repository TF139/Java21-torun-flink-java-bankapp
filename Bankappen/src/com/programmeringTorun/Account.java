package com.programmeringTorun;

import java.util.UUID;

public class Account {

    //constructor
    public Account(){
        accNr = UUID.randomUUID();
    }

    //state
    private double balance;
    private UUID accNr;
    private String accType = "Debit";

    //behaviour
    public double getBalance() {
        return balance;
    }

    public void depositCash(double num){
        balance = num + balance;
    }

    public void withdrawCash(double num){
        balance = balance - num;
    }

    public UUID getAccNr() {
        return accNr;
    }

    public String getAccType() {
        return accType;
    }

}