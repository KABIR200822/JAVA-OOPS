class BankAccount {
    private String number, name;
    private double balance;

    BankAccount(String number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) balance += amount;
        else System.out.println("Invalid deposit.");
    }

    void withdraw(double amount) {
        if (amount <= 0) System.out.println("Invalid amount.");
        else if (amount > balance) System.out.println("Insufficient balance.");
        else balance -= amount;
    }

    void display() {
        System.out.println("Account: " + number + "\nHolder: " + name
                + "\nBalance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("1001", "Aarav Sharma", 5000);
        BankAccount a2 = new BankAccount("1002", "Diya Patel", 8000);

        a1.deposit(1500);
        a1.withdraw(2000);
        a2.deposit(2500);
        a2.withdraw(12000);

        a1.display();
        a2.display();
    }
}
