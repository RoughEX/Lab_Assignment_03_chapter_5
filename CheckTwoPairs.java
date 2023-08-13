package Chapter5_solve;

import java.util.Scanner;

public class CheckTwoPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        System.out.print("Enter the fourth integer: ");
        int num4 = scanner.nextInt();


        scanner.close();


        int pairsCount = 0;

        if (num1 == num2) {
            pairsCount++;
        }

        if (num1 == num3) {
            pairsCount++;
        }

        if (num1 == num4) {
            pairsCount++;
        }

        if (num2 == num3) {
            pairsCount++;
        }

        if (num2 == num4) {
            pairsCount++;
        }

        if (num3 == num4) {
            pairsCount++;
        }


        if (pairsCount == 2) {
            System.out.println("Two pairs");
        } else {
            System.out.println("Not two pairs");
        }
    }
}
