import java.util.Scanner;

public class FindSubstring {
    public static void main(String[] args) {
        // Read input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String inputText = scanner.nextLine();

        // Find the position of the first and last occurrence of "the"
        int firstPos = inputText.indexOf("the");
        int lastPos = inputText.lastIndexOf("the");

        // Check if "the" exists in the text
        if (firstPos == -1 || lastPos == -1) {
            System.out.println("The word 'the' was not found.");
        } else {
            // Extract the characters between the first and last occurrence of "the"
            String substring = inputText.substring(firstPos + 3, lastPos);
            System.out.println("Substring between first and last 'the': " + substring);
        }
    }
}
