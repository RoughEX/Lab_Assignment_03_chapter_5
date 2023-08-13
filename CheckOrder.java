package Chapter5_solve;

import java.util.Scanner;

public class CheckOrder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();


        scanner.close();


        if (num1 < num2 && num2 < num3) {
            System.out.println("Increasing");
        }

        else if (num1 > num2 && num2 > num3) {
            System.out.println("Decreasing");
        }

        else {
            System.out.println("Neither");
        }
    }
}
