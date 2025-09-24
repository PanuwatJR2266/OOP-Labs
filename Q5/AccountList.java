package Q5;

import Q4.Account;

public class AccountList {
    private Account[] accounts;
    private int size;

    public AccountList(int x) {
        accounts = new Account[x];
        size = 0;
    }

    public boolean appendAccount(Account acc) {
        if (size < accounts.length) {
            accounts[size] = acc;
            size++;
            return true;
        }
        return false;
    }

    public Account getAccount(int idx) {
        if (idx < size) {
            return accounts[idx];
        } else {
            System.out.println("Input index exceeds the number of appended elements");
            return null;
        }
    }
}