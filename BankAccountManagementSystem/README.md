# Bank Account Management System

**Java OOP Assignment — 10 Marks**

A simple Java program demonstrating classes, objects, parameterized constructors, instance variables, and methods.

## Files

- `BankAccount.java` — Defines the `BankAccount` class with account details, deposit, withdrawal, balance-checking, and display methods.
- `Main.java` — Creates two independent bank accounts and performs deposit and withdrawal operations on both.

## How to Compile and Run

Open a terminal in this directory and run:

```bash
javac BankAccount.java Main.java
java Main
```

Each account has its own balance. A withdrawal is rejected when the requested amount is greater than the available balance. Non-positive deposit and withdrawal amounts are also rejected.
