import mathoperations.ArithmeticOperations;
import java.util.Scanner;

public class ArithmeticTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        ArithmeticOperations operations = new ArithmeticOperations();

        System.out.println("Sum: " + operations.add(num1, num2));
        System.out.println("Product: " + operations.multiply(num1, num2));
        System.out.println("Difference: " + operations.subtract(num1, num2));
        System.out.println("Quotient: " + operations.divide(num1, num2));

        scanner.close();
    }
}
