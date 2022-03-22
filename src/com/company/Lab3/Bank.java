package com.company.Lab3;

import java.util.HashMap;

public class Bank {

    private HashMap<Integer, Account> accountHashMap;

    public Bank(){
        this.accountHashMap = new HashMap<>();
    }

    public void add_Account(int id, Account account) {
        accountHashMap.put(id, account);
    }

    public void blockCredit(int id) {
        if (accountHashMap.get(id).getCredit_balance() < accountHashMap.get(id).getCredit_limit()){
            accountHashMap.get(id).disableAccount();
        } else {
         System.out.println("Нет прав закрыть аккаунт");
        }
    }
}
