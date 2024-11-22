abstract class Car {
    String brand;

    // Concrete method
    public void displayBrand() {
        System.out.println("Car Brand: " + brand);
    }

    // Abstract methods
    public abstract void avg();  // Method to calculate average
    public abstract void mode(); // Method to show mode
}

class Maruti extends Car {
    Maruti() {
        brand = "Maruti";
    }

    // Implementing abstract methods
    public void avg() {
        System.out.println("Maruti Average: 20 km/l");
    }

    public void mode() {
        System.out.println("Maruti Mode: Petrol");
    }
}

class Santro extends Car {
    Santro() {
        brand = "Santro";
    }

    // Implementing abstract methods
    public void avg() {
        System.out.println("Santro Average: 18 km/l");
    }

    public void mode() {
        System.out.println("Santro Mode: Petrol");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Car maruti = new Maruti();
        maruti.displayBrand();
        maruti.avg();
        maruti.mode();

        System.out.println();

        Car santro = new Santro();
        santro.displayBrand();
        santro.avg();
        santro.mode();
    }
}
