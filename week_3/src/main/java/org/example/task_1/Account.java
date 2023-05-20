package org.example.task_1;


import com.sun.istack.internal.NotNull;

public class Account {
    @NotNull
    private long accountNumber;
    private String accountHolderName;
    private float balance;

    public Account(long accountNumber, String accountHolderName, float balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void depositingMoney(float money)
    {
        balance+=money;
    }
    public void withdrawingMoney(float money)
    {
        if(balance-money>=0)
            balance-=money;
        else{
            throw new IllegalArgumentException("Sorry your balance is not enough for this transaction");
        }
    }



    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public float getBalance() {
        return balance;
    }


}
