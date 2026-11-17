public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Parameterized constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit money into the account
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }

        balance += amount;
        System.out.printf("Deposited: %.2f%n", amount);
    }

    // Withdraw money if sufficient balance is available
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal could not be completed.");
        } else {
            balance -= amount;
            System.out.printf("Withdrawn: %.2f%n", amount);
        }
    }

    // Display the current balance
    public void checkBalance() {
        System.out.printf("Current balance: %.2f%n", balance);
    }

    // Display all account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        checkBalance();
    }
}
