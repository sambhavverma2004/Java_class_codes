// Package FigPackage

package FigPackage;

// Abstract class Figure
public abstract class Figure {
    protected double r, a, v, pi = 3.1428;

    public abstract void calcArea();
    public abstract void calcVolume();
    public abstract void dispArea();
    public abstract void dispVolume();
}

// Cone class
class Cone extends Figure {
    double h, s;

    public Cone(double r, double h, double s) {
        this.r = r;
        this.h = h;
        this.s = s;
    }

    @Override
    public void calcArea() {
        a = pi * r * (r + s);  // Area of cone
    }

    @Override
    public void calcVolume() {
        v = (pi * r * r * h) / 3;  // Volume of cone
    }

    @Override
    public void dispArea() {
        System.out.println("Cone Area: " + a);
    }

    @Override
    public void dispVolume() {
        System.out.println("Cone Volume: " + v);
    }
}

// Similarly for Sphere and Cylinder (not repeating the code for brevity)
