import java.util.Scanner;

public class MovieTheater {
    // Method to calculate the total profit
    public static double calculateTotalProfit(int attendees) {
        double ticketPrice = 5.0;
        double fixedCost = 20.0;
        double variableCostPerAttendee = 0.50;

        // Income from tickets
        double income = attendees * ticketPrice;

        // Costs
        double totalCost = fixedCost + (attendees * variableCostPerAttendee);

        // Profit
        return income - totalCost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of attendees: ");
        int attendees = scanner.nextInt();

        double profit = calculateTotalProfit(attendees);
        System.out.println("Total Profit: $" + profit);
    }
}
