package com.mycompany.mainaccount;

import java.util.ArrayList;
import java.util.Date;

/**
 * WIA1002 Data Structure - Week 3 & 4 Lab
 * Question 2: Account and Transaction classes
 * 
 * @author Sadman Muttaki
 */

public class MainAccount {
    public static void main(String[] args) {
        // Create account with ID, initial balance, and interest rate
        Account acc = new Account(1122, 1000, 1.5);

        // Perform deposits
        acc.deposit(30);
        acc.deposit(40);
        acc.deposit(50);

        // Perform withdrawals
        acc.withdraw(5);
        acc.withdraw(4);
        acc.withdraw(2);

        // Display account details
        System.out.println(acc);
    }
}

// ------------------ TRANSACTION CLASS ------------------
class Transaction {
    private char type;         // 'D' for deposit, 'W' for withdraw
    private double amount;
    private double balance;
    private String description;
    private Date date;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return date + " | Type: " + type + " | Amount: $" + amount +
               " | Balance: $" + balance + " | Description: " + description;
    }
}

// ------------------ ACCOUNT CLASS ------------------
class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    // Deposit method - adds funds and records the transaction
    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, "Deposit"));
    }

    // Withdraw method - removes funds and records the transaction
    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transaction('W', amount, balance, "Withdraw"));
    }

    // Print account details and transaction history
    @Override
    public String toString() {
        String result = "--------------------------------------------\n";
        result += "Account ID: " + id + "\n";
        result += "Current Balance: $" + balance + "\n";
        result += "Annual Interest Rate: " + annualInterestRate + "%\n";
        result += "--------------------------------------------\n";
        result += "Transactions:\n";
        for (Transaction t : transactions) {
            result += t + "\n";
        }
        return result;
    }
}

