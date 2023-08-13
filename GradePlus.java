package Chapter5_solve;

import java.util.Scanner;

public class GradePlus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

 
        System.out.print("Enter a number between 0 and 4: ");
        double numericValue = scanner.nextDouble();

        scanner.close();

        String letterGrade = getLetterGrade(numericValue);


        System.out.println("The letter grade is " + letterGrade);
    }


    public static String getLetterGrade(double numericValue) {
        if (numericValue < 0 || numericValue > 4) {
            return "Invalid"; 
        }


        if (numericValue >= 3.85) {
            return "A";
        } else if (numericValue >= 3.5) {
            return "A-";
        } else if (numericValue >= 2.85) {
            return "B+";
        } else if (numericValue >= 2.5) {
            return "B";
        } else if (numericValue >= 1.85) {
            return "B-";
        } else if (numericValue >= 1.5) {
            return "C+";
        } else if (numericValue >= 0.85) {
            return "C";
        } else {
            return "C-";
        }
    }
}
