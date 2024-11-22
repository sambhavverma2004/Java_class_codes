class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary); // Use setter to validate salary
    }

    // Setters and Getters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            System.out.println("Salary cannot be negative or zero.");
            this.monthlySalary = 0;
        }
    }

    // Method to calculate yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to apply a raise
    public void applyRaise(double percentage) {
        if (percentage > 0) {
            monthlySalary += monthlySalary * (percentage / 100);
        }
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Doe", 3000);
        Employee employee2 = new Employee("Jane", "Smith", 4000);

        // Display yearly salaries
        System.out.printf("%s %s's Yearly Salary: $%.2f\n", employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());
        System.out.printf("%s %s's Yearly Salary: $%.2f\n", employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());

        // Apply 10% raise and display new salaries
        employee1.applyRaise(10);
        employee2.applyRaise(10);

        System.out.printf("After 10% raise, %s %s's Yearly Salary: $%.2f\n", employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());
        System.out.printf("After 10% raise, %s %s's Yearly Salary: $%.2f\n", employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());
    }
}
