package Lab1.Q5;

import Lab1.Q4.Q4Account;

public class Q5AccountListTest {
    public static void main(String[] args) {
        Q5AccountList al = new Q5AccountList(3);

        // success should be true
        boolean success = al.appendAccount(new Q4Account("Oak", 1.0));
        success = al.appendAccount(new Q4Account("Two", 0.1));

        // It should print “Input index exceeds the number of appended elements”
        Q4Account account = al.getAccount(2);
        System.out.println(account); // should print null

        account = al.getAccount(1);
        // Or whatever getter is specified. It should print 0.1.
        System.out.println(account.getBalance());

        success = al.appendAccount(new Q4Account("tmp", 0));
        success = al.appendAccount(new Q4Account("tmp2", 0));

        System.out.println(success); // it should print false
    }
}