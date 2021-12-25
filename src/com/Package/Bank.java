package com.Package;

public class Bank {
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    Bank(String cname, String cid){
        customerName = cname;
        customerID = cid;
    }

    void deposit(int amount){
        if(amount !=0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount){
        if(amount != 0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

}
