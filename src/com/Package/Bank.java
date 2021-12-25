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

    void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposited: " + previousTransaction);
        }else if (previousTransaction < 0){
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        }else{
            System.out.println("No transaction occurred");
        }
    }

    void calculateInterest(int years){
        double interestRate = .0185;
        double newBalance = (balance + interestRate * years) + balance;
        System.out.println("The current interest rate is " + (100 * interestRate));
        System.out.println("After " + years + " years, your balance will be: " + newBalance);
    }

}
