import java.util.Scanner;

public class Employee {

    // private instance variables
    private String employeeName;
    private double employeeSalary;

    // method to read employee data
    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter employee salary: ");
        employeeSalary = sc.nextDouble();
    }

    // method to display employee data
    public void displayEmployeeData() {
        System.out.println("\nEmployee Details");
        System.out.println("Name   : " + employeeName);
        System.out.println("Salary : " + employeeSalary);
    }

    // main method
    public static void main(String[] args) {

        // object creation
        Employee emp = new Employee();

        // method invocation
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}