import java.util.Scanner;

public class SeparateDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        // Extract digits
        int digit1 = number / 10000;
        int digit2 = (number / 1000) % 10;
        int digit3 = (number / 100) % 10;
        int digit4 = (number / 10) % 10;
        int digit5 = number % 10;

        // Print digits with three spaces in between
        System.out.println(digit1 + "   " + digit2 + "   " + digit3 + "   " + digit4 + "   " + digit5);

        scanner.close();
    }
}
