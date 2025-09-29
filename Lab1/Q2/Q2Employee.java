package Lab1.Q2;

public class Q2Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Q2Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }

    public Q2Employee(String firstName, String lastName) {
        this(firstName, lastName, 0);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            monthlySalary = monthlySalary + (monthlySalary * (percent / 100));
        }
    }
}
