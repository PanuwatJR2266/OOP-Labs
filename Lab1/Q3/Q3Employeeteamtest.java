package Lab1.Q3;

import Lab1.Q2.Q2Employee;

public class Q3Employeeteamtest {
    public static void main(String[] args) {
        Q2Employee Boss = new Q2Employee("Pachy", "XD", 1000);
        Q2Employee Employee = new Q2Employee("Panuwta", "JR", 2000);

        Q3Employeeteam Team = new Q3Employeeteam(Boss, Employee);

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