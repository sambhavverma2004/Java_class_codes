public class Bank {
    private double balance;

    // Constructor to initialize balance
    public Bank(double balance) {
        this.balance = balance;
    }

    // Method to deposit money
    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    // Method to withdraw money
    public double withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return balance;
        } else {
            System.out.println("Insufficient funds!");
            return balance;
        }
    }

    public static void main(String[] args) {
        Bank account = new Bank(1000); // Initial balance

        // Test deposit and withdraw
        System.out.println("Balance after deposit: " + account.deposit(500));
        System.out.println("Balance after withdrawal: " + account.withdraw(1200));
        System.out.println("Balance after withdrawal: " + account.withdraw(200));
    }
}
