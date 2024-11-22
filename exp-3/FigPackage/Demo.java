// Abstract class Figure
package FigPackage;

abstract class figure {
    protected double pi = 3.142;

    // Abstract methods
    public abstract void calcArea();
    public abstract void calcVolume();
    public abstract void dispArea();
    public abstract void dispVolume();
}

// Cone class
class cone extends figure {
    double r, h, a, v;

    public cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public void calcArea() {
        a = pi * r * (r + Math.sqrt(r * r + h * h));  // Cone surface area
    }

    public void calcVolume() {
        v = (pi * r * r * h) / 3;  // Cone volume formula
    }

    public void dispArea() {
        System.out.println("Cone Area: " + a);
    }

    public void dispVolume() {
        System.out.println("Cone Volume: " + v);
    }
}

// Sphere class
class Sphere extends figure {
    double r, a, v;

    public Sphere(double r) {
        this.r = r;
    }

    public void calcArea() {
        a = 4 * pi * r * r;  // Surface area of sphere
    }

    public void calcVolume() {
        v = (4.0 / 3.0) * pi * r * r * r;  // Volume of sphere
    }

    public void dispArea() {
        System.out.println("Sphere Area: " + a);
    }

    public void dispVolume() {
        System.out.println("Sphere Volume: " + v);
    }
}

// Cylinder class
class Cylinder extends figure {
    double r, h, a, v;

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public void calcArea() {
        a = 2 * pi * r * (r + h);  // Surface area of cylinder
    }

    public void calcVolume() {
        v = pi * r * r * h;  // Volume of cylinder
    }

    public void dispArea() {
        System.out.println("Cylinder Area: " + a);
    }

    public void dispVolume() {
        System.out.println("Cylinder Volume: " + v);
    }
}

public class Demo {
    public static void main(String[] args) {
        // Creating objects of each figure type
        figure cone = new cone(5.0, 10.0);
        figure sphere = new Sphere(7.0);
        figure cylinder = new Cylinder(3.0, 8.0);

        // Calculate and display area and volume for Cone
        cone.calcArea();
        cone.calcVolume();
        cone.dispArea();
        cone.dispVolume();

        // Calculate and display area and volume for Sphere
        sphere.calcArea();
        sphere.calcVolume();
        sphere.dispArea();
        sphere.dispVolume();

        // Calculate and display area and volume for Cylinder
        cylinder.calcArea();
        cylinder.calcVolume();
        cylinder.dispArea();
        cylinder.dispVolume();
    }
}
