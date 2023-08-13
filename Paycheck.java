package Chapter5_solve;


public class Paycheck {
    private String employeeName;
    private double hourlyWage;
    private double hoursWorked;


    public Paycheck(String name, double wage, double hours) {
        employeeName = name;
        hourlyWage = wage;
        hoursWorked = hours;
    }


    public void printPaycheck() {
        double regularPay;
        double overtimePay = 0.0;


        if (hoursWorked <= 40) {
            regularPay = hoursWorked * hourlyWage;
        } else {
            regularPay = 40 * hourlyWage;
            overtimePay = (hoursWorked - 40) * hourlyWage * 1.5;
        }

        double totalPay = regularPay + overtimePay;


        System.out.println("Paycheck for " + employeeName);
        System.out.println("Regular hours: " + hoursWorked + " hours");
        if (hoursWorked > 40) {
            System.out.println("Overtime hours: " + (hoursWorked - 40) + " hours");
        }
        System.out.println("Regular pay: $" + regularPay);
        System.out.println("Overtime pay: $" + overtimePay);
        System.out.println("Total pay: $" + totalPay);
    }
}

