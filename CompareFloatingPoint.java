package Chapter5_solve;

import java.util.Scanner;

public class CompareFloatingPoint {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first floating-point number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second floating-point number: ");
        double num2 = scanner.nextDouble();


        scanner.close();


        boolean areEqual = areEqualUpToTwoDecimalPlaces(num1, num2);


        if (areEqual) {
            System.out.println("The numbers are the same up to two decimal places.");
        } else {
            System.out.println("The numbers are not the same up to two decimal places.");
        }
    }

    public static boolean areEqualUpToTwoDecimalPlaces(double num1, double num2) {

        int scaledNum1 = (int) (num1 * 100);
        int scaledNum2 = (int) (num2 * 100);


        return scaledNum1 == scaledNum2;
    }
}
