import java.util.Scanner;

public class DailyDrivingCost {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data
        System.out.print("Enter total miles driven per day: ");
        double milesDriven = scanner.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = scanner.nextDouble();

        System.out.print("Enter average fees per day: ");
        double averageFees = scanner.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tolls = scanner.nextDouble();

        // Assuming car's fuel efficiency is 25 miles per gallon
        double fuelEfficiency = 25.0;
        double gallonsUsed = milesDriven / fuelEfficiency;
        double fuelCost = gallonsUsed * costPerGallon;

        // Calculate total daily cost
        double totalDailyCost = fuelCost + averageFees + tolls;

        // Output the total daily cost
        System.out.printf("Your total daily driving cost is: $%.2f\n", totalDailyCost);

        scanner.close();
    }
}
