import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is larger");
        } else if (num1 < num2) {
            System.out.println(num2 + " is larger");
        } else {
            System.out.println("The numbers are equal");
        }

        scanner.close();
    }
}
