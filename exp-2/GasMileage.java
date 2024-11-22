import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalMiles = 0;
        double totalGallons = 0;
        int tripCount = 0;

        while (true) {
            System.out.print("Enter miles driven for trip (or -1 to end): ");
            double miles = scanner.nextDouble();
            if (miles == -1) break;

            System.out.print("Enter gallons used for this trip: ");
            double gallons = scanner.nextDouble();

            totalMiles += miles;
            totalGallons += gallons;
            tripCount++;

            double mpg = miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f\n", mpg);
        }

        if (totalGallons > 0) {
            double combinedMPG = totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon: %.2f\n", combinedMPG);
        } else {
            System.out.println("No trips were entered.");
        }

        scanner.close();
    }
}
