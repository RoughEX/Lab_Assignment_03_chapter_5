package Chapter5_solve;

import java.util.Scanner;

public class WaterStateAtTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter 'C' for Celsius or 'F' for Fahrenheit: ");
        char unit = scanner.next().charAt(0);

        scanner.close();

        if (unit == 'F' || unit == 'f') {
            temperature = (temperature - 32) * 5.0 / 9.0;
        }

        String waterState;
        if (temperature <= 0) {
            waterState = "solid";
        } else if (temperature < 100) {
            waterState = "liquid";
        } else {
            waterState = "gaseous";
        }

        System.out.println("Water is in the " + waterState + " state at " + temperature + " degrees Celsius.");
    }
}
