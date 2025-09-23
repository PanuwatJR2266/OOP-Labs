public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setID("1");
        e1.setName("Panuwat");
        e1.setSalary(100000.0);
        System.out.println("" + e1.getName());
        System.out.println("" + e1.getSalary());

        Employee e2 = new Employee();
        e2.setID("2");
        e2.setName("Pachy");
        e2.setSalary(300.0);
        System.out.println("" + e2.getName());
        System.out.println("" + e2.getSalary());
    }
}