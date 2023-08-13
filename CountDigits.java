package Chapter5_solve;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int num = scanner.nextInt();

        scanner.close();

        if (num < 0) {
            num *= -1;
        }


        int count = 0;

        if (num == 0) {
            count = 1;
        } else {

            while (num > 0) {
                num /= 10;
                count++;
            }
        }

        System.out.println("The number of digits is: " + count);
    }
}
