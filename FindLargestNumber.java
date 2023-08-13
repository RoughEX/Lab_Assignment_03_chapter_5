package Chapter5_solve;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();


        scanner.close();


        double largestNumber = findLargest(num1, num2, num3);


        System.out.println("The largest number is: " + largestNumber);
    }

    public static double findLargest(double num1, double num2, double num3) {
        double max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        return max;
    }
}
