import java.util.Scanner;

// Abstract class for common operations
abstract class NumberOperations {
    abstract void calculateSum(int a, int b, int c);
    abstract void calculateProduct(int a, int b, int c);
    abstract void calculateAverage(int a, int b, int c);
    abstract void findLargest(int a, int b, int c);
    abstract void findSmallest(int a, int b, int c);
}

// Interface with specific methods
interface Operations {
    void calculateSum(int a, int b, int c);
    void calculateProduct(int a, int b, int c);
    void calculateAverage(int a, int b, int c);
    void findLargest(int a, int b, int c);
    void findSmallest(int a, int b, int c);
}

class MathOperations extends NumberOperations implements Operations {

    @Override
    public void calculateSum(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }

    @Override
   public void calculateProduct(int a, int b, int c) {
        System.out.println("Product: " + (a * b * c));
    }

    @Override
    public void calculateAverage(int a, int b, int c) {
        System.out.println("Average: " + (a + b + c) / 3.0);
    }

    @Override
   public void findLargest(int a, int b, int c) {
        int largest = Math.max(a, Math.max(b, c));
        System.out.println("Largest: " + largest);
    }

    @Override
    public void findSmallest(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c));
        System.out.println("Smallest: " + smallest);
    }
}

public class MathOperationsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third integer: ");
        int num3 = scanner.nextInt();

        MathOperations operations = new MathOperations();

        operations.calculateSum(num1, num2, num3);
        operations.calculateProduct(num1, num2, num3);
        operations.calculateAverage(num1, num2, num3);
        operations.findLargest(num1, num2, num3);
        operations.findSmallest(num1, num2, num3);

        scanner.close();
    }
}
