package Chapter5_solve;

import java.util.Scanner;

public class CompareFirstAndLastLetter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");

        // Read the string entered by the user
        String inputString = scanner.nextLine();

        // Close the scanner as we no longer need it
        scanner.close();

        // Get the first and last characters of the input string
        char firstChar = inputString.charAt(0);
        char lastChar = inputString.charAt(inputString.length() - 1);

        // Compare the first and last characters
        if (firstChar == lastChar) {
            System.out.println("First and last letter are the same.");
        } else {
            System.out.println("First and last letter are different.");
        }
    }
}
