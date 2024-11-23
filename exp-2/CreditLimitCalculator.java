import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input account details
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();

        System.out.print("Enter beginning balance: ");
        double beginningBalance = scanner.nextDouble();

        System.out.print("Enter total charges: ");
        double totalCharges = scanner.nextDouble();

        System.out.print("Enter total credits: ");
        double totalCredits = scanner.nextDouble();

        System.out.print("Enter credit limit: ");
        double creditLimit = scanner.nextDouble();

        // Calculate new balance
        double newBalance = beginningBalance + totalCharges - totalCredits;

        // Determine if the customer has exceeded their credit limit
        if (newBalance > creditLimit) {
            System.out.printf("Account %s has exceeded the credit limit. New balance: $%.2f\n", accountNumber, newBalance);
        } else {
            System.out.printf("Account %s is within the credit limit. New balance: $%.2f\n", accountNumber, newBalance);
        }

        scanner.close();
    }
}
