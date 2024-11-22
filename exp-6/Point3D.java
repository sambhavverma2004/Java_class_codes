import java.util.Scanner;

public class Point3D {
    private int x, y, z;

    // Constructor to create a 3D point
    public Point3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    // Constructor to create a point with arbitrary coordinates
    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Method to input the coordinates
    public void inputCoordinates() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        x = scanner.nextInt();
        System.out.print("Enter y coordinate: ");
        y = scanner.nextInt();
        System.out.print("Enter z coordinate: ");
        z = scanner.nextInt();
    }

    // Method to output the coordinates
    public void outputCoordinates() {
        System.out.println("Coordinates of the point: (" + x + ", " + y + ", " + z + ")");
    }

    public static void main(String[] args) {
        Point3D point = new Point3D();
        point.inputCoordinates();
        point.outputCoordinates();
    }
}
