class Date {
    private int month;
    private int day;
    private int year;

    // Constructor
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Setters and Getters
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method to display date in "month/day/year" format
    public void displayDate() {
        System.out.printf("%d/%d/%d\n", month, day, year);
    }
}

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(11, 22, 2024);
        date.displayDate(); // Displays 11/22/2024
    }
}
