package Chapter5_solve;

import java.util.Scanner;

public class IncreasingOrDecreasingPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mode ('strict' or 'lenient'): ");
        String mode = scanner.nextLine().toLowerCase();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        scanner.close();

        String order;
        if (mode.equals("strict")) {
            if (num1 < num2 && num2 < num3) {
                order = "increasing";
            } else if (num1 > num2 && num2 > num3) {
                order = "decreasing";
            } else {
                order = "neither";
            }
        } else if (mode.equals("lenient")) {
            if ((num1 <= num2 && num2 <= num3) || (num1 >= num2 && num2 >= num3)) {
                order = "increasing and decreasing";
            } else if (num1 < num2 && num2 < num3) {
                order = "increasing";
            } else if (num1 > num2 && num2 > num3) {
                order = "decreasing";
            } else {
                order = "neither";
            }
        } else {
            order = "invalid mode";
        }

        System.out.println("The numbers are in " + order + " order.");
    }
}
