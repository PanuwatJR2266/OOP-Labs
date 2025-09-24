package Q2;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Employee("Panuwat", "JR", 20000);
        Employee e2 = new Employee("Jao", "Sorn", 30000);

        System.out.println("monthly before");
        printEmployeeInfo(e1);
        printEmployeeInfo(e2);
        System.out.println("======================================================================");

        e1.raiseSalary(10);
        e2.raiseSalary(10);

        System.out.println("monthly after 10%");
        printEmployeeInfo(e1);
        printEmployeeInfo(e2);
        System.out.println("======================================================================");
    }

    public static void printEmployeeInfo(Employee e) {
        System.out.println(
                " Name: " + e.getFirstName() + " " + e.getLastName() + " Monthly: " + e.getMonthlySalary() + " bath" + " Yearly: " + e.getYearlySalary() + " bath");
    }
}
