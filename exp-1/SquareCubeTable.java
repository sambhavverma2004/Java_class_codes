public class SquareCubeTable {

    public static void main(String[] args) {
        System.out.println("Number | Square | Cube");
        System.out.println("-------------------------");

        for (int i = 0; i <= 10; i++) {
            int square = i * i;
            int cube = i * i * i;
            System.out.println(i + "      | " + square + "     | " + cube);
        }
    }
}
