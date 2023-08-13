package Chapter5_solve;

import java.util.Scanner;

public class EmployeePayroll {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter hourly wage: $");
        double hourlyWage = scanner.nextDouble();

        System.out.print("Enter hours worked in the past week: ");
        double hoursWorked = scanner.nextDouble();


        scanner.close();

        Paycheck paycheck = new Paycheck(name, hourlyWage, hoursWorked);
        paycheck.printPaycheck();
    }
}
