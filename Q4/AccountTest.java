package Q4;

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account("sunlight", 120000);

        System.out.println(acc.getName());
        System.out.println("Balance: " + acc.getBalance());

        System.out.println("=====================================");

        acc.setName("moonlight");
        System.out.println("After name: " + acc.getName());
        acc.deposit(1000);
        System.out.println("After deposit : " + acc.getBalance());

        acc.deposit(-500);
        System.out.println("After invalid deposit: " + acc.getBalance());
    }
}
