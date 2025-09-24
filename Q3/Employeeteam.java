package Q3;

import Q2.Employee;

public class Employeeteam {
    private Employee Boss;
    private Employee Employee;

    public Employeeteam(Employee Boss, Employee Employee) {
        this.Boss = Boss;
        this.Employee = Employee;

    }

    public void printEmployeeDetails() {
        System.out.print("Employee: " + Employee.getFirstName());
        System.out.println(" " + Employee.getLastName());
        System.out.println("Monthly Salary: " + Employee.getMonthlySalary());
    }

    public void printALLEmployeeDetails() {
        System.out.print("Boss: " + Boss.getFirstName());
        System.out.println(" " + Boss.getLastName());
        System.out.println("Monthly Salary: " + Boss.getMonthlySalary());

        System.out.print("Employee: " + Employee.getFirstName());
        System.out.println(" " + Employee.getLastName());
        System.out.println("Monthly Salary: " + Employee.getMonthlySalary());
    }

    public void updateSalaryOfEmployee(String firstname, double newSalary) {
        if (newSalary > 0) {
            if (Boss.getFirstName().equalsIgnoreCase(firstname)) {
                Boss.setMonthlySalary(newSalary);
                System.out.println("Updated Boss salary to: " + newSalary);
            }
            if (Employee.getFirstName().equalsIgnoreCase(firstname)) {
                Employee.setMonthlySalary(newSalary);
                System.out.println("Updated Employee salary to: " + newSalary);
            }
        }
    }

    public void giveRaiseToAllEmployees() {
        Boss.raiseSalary(10);
        Employee.raiseSalary(10);
        System.out.println("10% raise given to both boss and employee.");
    }
}