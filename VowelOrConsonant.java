package Chapter5_solve;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a single character
        System.out.print("Enter a single character from the alphabet: ");
        String input = scanner.nextLine();

        // Close the scanner as we no longer need it
        scanner.close();

        // Convert the input to uppercase for case-insensitivity
        input = input.toUpperCase();

        // Check the length of the input
        if (input.length() != 1) {
            System.out.println("Error: Please enter a single character.");
        } else {
            char character = input.charAt(0);

            // Check if the character is a letter (between 'a' and 'z' or 'A' and 'Z')
            if ((character >= 'A' && character <= 'Z')) {
                // Check if the character is a vowel or a consonant
                if (isVowel(character)) {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            } else {
                System.out.println("Error: Please enter a valid character from the alphabet.");
            }
        }
    }

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char character) {
        return character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U';
    }
}
