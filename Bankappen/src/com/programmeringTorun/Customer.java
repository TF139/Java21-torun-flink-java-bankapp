package com.programmeringTorun;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    //constructor
    public Customer(String name, long pNr){
        this.name=name;
        this.pNr=pNr;
        accounts = new ArrayList<>();
    }

    //state
    private String name;
    private long pNr;
    private List<Account> accounts;

    //behaviour
    public void addAccount(Account account){
        accounts.add(account);
    }

    public long getpNr() {
        return pNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCustomerAccounts() {
        List<String>accInfo = new ArrayList<>();
        for (var item: accounts){
            accInfo.add(String.valueOf(item.getAccNr()));
            accInfo.add(String.valueOf(item.getBalance()));
            accInfo.add(item.getAccType());
        }
        return accInfo;
    }

    public void removeAccount1(int accIndex){
        accounts.remove(accIndex-1);
    }

    public void deposit(int indexNum, int num){
        accounts.get(indexNum-1).depositCash(num);
    }

    public void withdraw(int indexNum, int num){
        for (var item: accounts){
            if (num<= item.getBalance()){
                accounts.get(indexNum-1).withdrawCash(num);
                System.out.println(getName() + " withdrew: " + num + " from account nr: " + indexNum);
                break;
            }
            else
            {
                System.out.println(getName() + ", UNSUCCESSFUL WITHDRAW! Available money on the account is: " + item.getBalance());
            }
        }
    }

    public Object getTotBalance(long pNr){
        for (var item: accounts)
            if(pNr == getpNr()){
                double tot = item.getBalance();
                return tot;
            }
        return null;
    }

}