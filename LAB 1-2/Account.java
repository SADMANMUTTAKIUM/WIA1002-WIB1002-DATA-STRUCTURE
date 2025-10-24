package com.mycompany.account;

import java.util.Date;
import java.util.Scanner;
public class Account {
private int id;
private double balance;
private static double annualInterestRate = 0.0;
private Date dateCreated;
// No-arg constructor
public Account() {
id = 0;
balance = 0.0;
dateCreated = new Date();
}
// Constructor with id and balance
public Account(int id, double balance) {
this.id = id;
this.balance = balance;
dateCreated = new Date();
}
// Getters and setters
public int getId() { return id; }
public void setId(int id) { this.id = id; }
public double getBalance() { return balance; }
public void setBalance(double balance) { this.balance = balance; }
public static double getAnnualInterestRate() { return annualInterestRate; }
public static void setAnnualInterestRate(double rate) { annualInterestRate = rate; }
public Date getDateCreated() { return dateCreated; }
// Methods
public double getMonthlyInterestRate() {
return annualInterestRate / 12 / 100;
}
public double getMonthlyInterest() {
return balance * getMonthlyInterestRate();
}
public void withdraw(double amount) {
balance -= amount;
}
public void deposit(double amount) {
balance += amount;
}
// Test program (ATM simulation)
public static void main(String[] args) {
Account[] accounts = new Account[10];
for (int i = 0; i < accounts.length; i++) {
accounts[i] = new Account(i, 100);
}
Scanner input = new Scanner(System.in);
while (true) {
System.out.print("Enter an id: ");
int id = input.nextInt();
if (id < 0 || id > 9) {
System.out.println("Invalid ID. Try again.");
continue;
}
while (true) {
System.out.println("\nMain menu");
System.out.println("1: check balance");
System.out.println("2: withdraw");
System.out.println("3: deposit");
System.out.println("4: exit");
System.out.print("Enter a choice: ");
int choice = input.nextInt();
if (choice == 1) {
System.out.println("The balance is " + accounts[id].getBalance());
} else if (choice == 2) {
System.out.print("Enter an amount to withdraw: ");
double amount = input.nextDouble();
accounts[id].withdraw(amount);
} else if (choice == 3) {
System.out.print("Enter an amount to deposit: ");
double amount = input.nextDouble();
accounts[id].deposit(amount);
} else if (choice == 4) {
break;
}
}
}
}
}