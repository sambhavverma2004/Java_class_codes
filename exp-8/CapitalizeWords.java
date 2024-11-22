import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        // Read input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String inputText = scanner.nextLine();

        // Split the input text into words
        String[] words = inputText.split(" ");

        // Capitalize the first letter of each word
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                // Capitalize the first letter and concatenate the rest of the word
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1)).append(" ");
            }
        }

        // Print the resulting string
        System.out.println("Resulting string: " + result.toString().trim());
    }
}
