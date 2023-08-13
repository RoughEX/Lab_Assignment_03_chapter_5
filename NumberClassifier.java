package Chapter5_solve;

import java.util.Scanner;


public class NumberClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();
        if (num < 0) {
            System.out.println("The number is negative.");
        } else if (num == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is positive.");
        }
    }
}