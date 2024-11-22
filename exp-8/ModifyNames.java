import java.util.Arrays;

public class ModifyNames {
    public static void main(String[] args) {
        // Array of names
        String[] names = {"John", "Michael", "Sarah", "Jessica", "William",
                "Alexander", "Benjamin", "Charlotte", "Sophia", "Emma"};

        // Remove the first three characters of each name
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > 3) {
                names[i] = names[i].substring(3);  // Remove the first three characters
            }
        }

        // Sort the names alphabetically
        Arrays.sort(names);

        // Print the modified names
        System.out.println("Modified names in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
