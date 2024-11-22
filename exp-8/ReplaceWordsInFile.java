import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class ReplaceWordsInFile {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "sdj.txt";

        try {
            // Read the content of the file into a string
            String content = new String(Files.readAllBytes(Paths.get(filePath)));

            // Replace all occurrences of "his" with "her"
            content = content.replaceAll("\\bhis\\b", "her");

            // Write the modified content back to the file (or another file)
            Files.write(Paths.get(filePath), content.getBytes());

            System.out.println("Replaced all occurrences of 'his' with 'her' in the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while processing the file.");
            e.printStackTrace();
        }
    }
}
