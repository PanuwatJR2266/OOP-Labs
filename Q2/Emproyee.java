package Q2;

public class Emproyee {
    private String frist_name;
    private String last_name;
    private double monthly_salary;

    public Emproyee(String frist_name, String last_name, double salary) {
        this.frist_name = frist_name;
        this.last_name = last_name;
        if (monthly_salary > 0) {
            this.monthly_salary = salary;
        } else {
            this.monthly_salary = 0.0d;
        }
    }

    public Emproyee(String frist_name, String last_name) {
        this.frist_name = frist_name;
        this.last_name = last_name;
        this.monthly_salary = 0;
    }

    public void setfrist_name(String Fname) {
        this.frist_name = Fname;
    }

    public void setlast_name(String Lname) {
        this.last_name = Lname;
    }

    public void setmonthly_salary(double salary) {
        this.monthly_salary = salary;

    }

}
