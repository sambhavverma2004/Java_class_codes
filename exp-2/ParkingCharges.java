import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hours parked: ");
        double hoursParked = scanner.nextDouble();

        // Calculate parking charge
        double charge = 2.00; // Minimum fee for up to 3 hours
        if (hoursParked > 3) {
            charge += (Math.ceil(hoursParked - 3)) * 0.50;
        }

        // Maximum charge per day
        if (charge > 10.00) {
            charge = 10.00;
        }

        System.out.printf("The parking charge is: $%.2f\n", charge);

        scanner.close();
    }
}
