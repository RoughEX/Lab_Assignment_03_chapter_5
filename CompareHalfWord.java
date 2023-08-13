package Chapter5_solve;

import java.util.Scanner;

public class CompareHalfWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");

        String inputWord = scanner.nextLine();

        scanner.close();

        int wordLength = inputWord.length();

        int firstHalfEndIndex = wordLength / 2;
        int secondHalfStartIndex = (wordLength % 2 == 0) ? firstHalfEndIndex : firstHalfEndIndex + 1;

        String firstHalf = inputWord.substring(0, firstHalfEndIndex);
        String secondHalf = inputWord.substring(secondHalfStartIndex);

        if (firstHalf.equals(secondHalf)) {
            System.out.println("First and second half are the same.");
        } else {
            System.out.println("First and second half are different.");
        }
    }
}
