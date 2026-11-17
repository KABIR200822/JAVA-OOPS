public class Main {
    public static void main(String[] args) {
        // Create two independent bank accounts
        BankAccount account1 = new BankAccount("1001", "Aarav Sharma", 5000.00);
        BankAccount account2 = new BankAccount("1002", "Diya Patel", 8000.00);

        // Operations on the first account
        System.out.println("===== Account 1 =====");
        account1.deposit(1500.00);
        account1.withdraw(2000.00);
        account1.displayDetails();

        System.out.println();

        // Operations on the second account
        System.out.println("===== Account 2 =====");
        account2.deposit(2500.00);
        account2.withdraw(12000.00); // Demonstrates insufficient balance
        account2.displayDetails();

        System.out.println();

        // Display final balances separately
        System.out.println("===== Final Balances =====");
        System.out.print("Account 1 - ");
        account1.checkBalance();

        System.out.print("Account 2 - ");
        account2.checkBalance();
    }
}
