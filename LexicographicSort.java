package Chapter5_solve;

import java.util.Arrays;
import java.util.Scanner;

public class LexicographicSort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        System.out.print("Enter the third string: ");
        String str3 = scanner.nextLine();


        scanner.close();


        String[] strings = {str1, str2, str3};


        Arrays.sort(strings);


        System.out.println("The sorted strings are:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
