# ATM-Process
# ATM Simulation in Java

This project is a simple ATM simulation implemented in Java. The program allows users to check their balance, deposit money, withdraw money, and exit. It also incorporates basic security by requiring a valid PIN before accessing the ATM functionalities.

## Features

- **Check Balance**: View the current account balance.
- **Deposit Money**: Deposit any valid amount into the account.
- **Withdraw Money**: Withdraw funds, ensuring that the amount does not exceed the available balance.
- **PIN Validation**: Requires a correct PIN to access the ATM.
- **Exit**: Safely exit the application.

## Technologies

- Java

## How to Run the Program

1. **Clone or Download the Project**:
   Download the source code or clone this repository.

2. **Compile the Code**:
   Open a terminal and navigate to the project directory. Use the following command to compile the Java file:
   ```bash
   javac ATM.java
3. Run the Program: After compiling, run the program with:
    ```bash
   java ATM
Using the ATM:

4. Enter the correct PIN (1234 by default).
      Choose an option from the ATM menu:
          1: Check your current balance.
          2: Deposit money into your account.
          3: Withdraw money from your account.
          4: Exit the program.
   Enter your PIN: 1234
    ```bash
    ATM Menu:
    1. Check Balance
    2. Deposit
    3. Withdraw
    4. Exit

    Choose an option: 1
    Your current balance is: $0.0

    Choose an option: 2
    Enter amount to deposit: 500
    Successfully deposited $500.0

    Choose an option: 3
    Enter amount to withdraw: 100
    Successfully withdrew $100.0

    Choose an option: 4
    Thank you for using the ATM. Goodbye!
## Error Handling
- **Incorrect PIN**: The program will exit if an incorrect PIN is entered.
- **Invalid Deposit/Withdrawal**: If an invalid amount (negative or exceeding balance) is entered for deposit or withdrawal, the program will notify the user and prompt again.

