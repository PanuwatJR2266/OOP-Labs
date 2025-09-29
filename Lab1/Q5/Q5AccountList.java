package Lab1.Q5;

import Lab1.Q4.Q4Account;

public class Q5AccountList {
    private Q4Account[] accounts;
    private int size;

    public Q5AccountList(int x) {
        accounts = new Q4Account[x];
        size = 0;
    }

    public boolean appendAccount(Q4Account acc) {
        if (size < accounts.length) {
            accounts[size] = acc;
            size++;
            return true;
        }
        return false;
    }

    public Q4Account getAccount(int idx) {
        if (idx < size) {
            return accounts[idx];
        } else {
            System.out.println("Input index exceeds the number of appended elements");
            return null;
        }
    }
}