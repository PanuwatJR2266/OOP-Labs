package Q3;

import Q2.Employee;

public class Employeeteamtest {
    public static void main(String[] args) {
        Employee Boss = new Employee("Pachy", "XD", 1000);
        Employee Employee = new Employee("Panuwta", "JR", 2000);

        Employeeteam Team = new Employeeteam(Boss, Employee);

        System.out.println("================================================================");
        System.out.println("Employee and Salary");
        Team.printEmployeeDetails();

        System.out.println("================================================================");
        System.out.println("ALL Employee and Salary");
        Team.printALLEmployeeDetails();

        System.out.println("================================================================");
        System.out.println("Update Salary of Employee");
        Team.updateSalaryOfEmployee("Panuwat", 3000);
        Team.updateSalaryOfEmployee("pachy", 2000);

        System.out.println("================================================================");
        Team.printALLEmployeeDetails();

        System.out.println("================================================================");
        System.out.println("10% Raise Given To Both Boss And Employee.");
        Team.giveRaiseToAllEmployees();
        Team.printALLEmployeeDetails();

        System.out.println("================================================================");
    }
}