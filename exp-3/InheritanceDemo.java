// Base class Figure
class Figure {
    double r, a, v;

    // Methods to display area and volume
    public void dispArea() {
        System.out.println("Volume of the figure: " + v);
    }

    public void dispVolume() {
        System.out.println("Area of the figure: " + a);
    }
}

// Derived class Cone that extends Figure
class cone extends Figure {
    double h, s;

    // Constructor to initialize radius, height, and slant height
    public cone(double r, double h, double s) {
        this.r = r;
        this.h = h;
        this.s = s;
    }

    // Method to calculate the area of the cone
    public void calcArea() {
        a = Math.PI * r * (r + s);  // Formula for the area of a cone
    }

    // Method to calculate the volume of the cone
    public void calcVolume() {
        v = (Math.PI * r * r * h) / 3;  // Formula for the volume of a cone
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Creating an object of Cone
        cone cone = new cone(5.0, 10.0, 12.0);
        cone.calcArea();   // Calculate and store area
        cone.calcVolume(); // Calculate and store volume

        // Display the results
        cone.dispArea();   // Display volume (since dispArea prints volume)
        cone.dispVolume(); // Display area (since dispVolume prints area)
    }
}
