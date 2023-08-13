package Chapter5_solve;

import java.util.Scanner;

public class CompassDirection {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the angle (degrees): ");
        int angle = scanner.nextInt();


        scanner.close();


        angle = ((angle % 360) + 360) % 360;


        String[] directions = {"N", "NE", "E", "SE", "S", "SW", "W", "NW"};
        int[] directionAngles = {0, 45, 90, 135, 180, 225, 270, 315};

        int nearestDirectionIndex = 0;
        int minDifference = Math.abs(angle - directionAngles[0]);

        for (int i = 1; i < directionAngles.length; i++) {
            int difference = Math.abs(angle - directionAngles[i]);
            if (difference < minDifference) {
                minDifference = difference;
                nearestDirectionIndex = i;
            }
        }


        System.out.println("Nearest compass direction: " + directions[nearestDirectionIndex]);
    }
}
