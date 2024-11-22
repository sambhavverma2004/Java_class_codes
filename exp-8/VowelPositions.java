import java.util.Scanner;

public class VowelPositions {
    public static void main(String[] args) {
        // Read input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String inputText = scanner.nextLine();

        // Define the vowels
        String vowels = "aeiouAEIOU";

        System.out.println("Vowels and their positions:");
        for (int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);
            if (vowels.indexOf(ch) != -1) {  // Check if the character is a vowel
                System.out.println("Vowel: " + ch + " at position: " + i);
            }
        }
    }
}
