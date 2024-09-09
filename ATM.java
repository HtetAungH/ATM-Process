package com.codewitharkar;

import java.util.Scanner;

public class ATM {
    private double balance;
    private int pin;

    public ATM(double balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
                System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
                System.out.println("Successfully withdrew $:" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public boolean validatePin(int pin) {
        return pin == this.pin;
    }
        public static void main(String[]args) {
            Scanner sc = new Scanner(System.in);
                ATM atm = new ATM(0, 1234);
                System.out.print("Enter your PIN: ");
                int pin = sc.nextInt();
                    if (!atm.validatePin(pin)) {
                        System.out.println("Incorrect PIN. Exiting...");
                        sc.close();
                        return;
                    }
                    while (true) {
                        System.out.println("\nATM Menu:");
                        System.out.println("1. Check Balance");
                        System.out.println("2. Deposit");
                        System.out.println("3. Withdraw");
                        System.out.println("4. Exit");
                        System.out.print("Choose an option: ");

                        int choice = sc.nextInt();
                            switch (choice) {
                                case 1: System.out.print("Your current balance is: $" + atm.getBalance()); break;
                                case 2: System.out.println("Enter amount to deposit: ");
                                    double depositAmount = sc.nextDouble();
                                    atm.deposit(depositAmount); break;
                                case 3: System.out.print("Enter amount to withdraw: ");
                                    double withdrawAmount = sc.nextDouble();
                                    atm.withdraw(withdrawAmount); break;
                                case 4: System.out.println("Thank you for using the ATM. Goodbye!");
                                    sc.close();
                                    return;
                                default: System.out.println("Invalid choice. Please try again."); break;
                            }
                    }
        }
}
