// Class X with attributes i and j
class X {
    int i, j;

    // Constructor
    public X(int i, int j) {
        this.i = i;
        this.j = j;
    }

    // Method to calculate sum of i and j
    public int finalSum() {
        return i + j;
    }
}

// Class Y extends X
class Y extends X {

    // Constructor to initialize i and j
    public Y(int i, int j) {
        super(i, j);
    }

    // Method to calculate product of i and j
    public int findProduct() {
        return i * j;
    }
}

// Class Z extends Y
class Z extends Y {

    public Z(int i, int j) {
        super(i, j);
    }

    // Method to calculate the difference
    public int findDifference() {
        return i - j;
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        // Create an object of class Z
        Z obj = new Z(10, 5);

        // Using methods from X, Y, and Z
        System.out.println("Sum: " + obj.finalSum());
        System.out.println("Product: " + obj.findProduct());
        System.out.println("Difference: " + obj.findDifference());
    }
}
