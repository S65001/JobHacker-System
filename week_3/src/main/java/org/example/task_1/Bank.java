package org.example.task_1;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> customers=new ArrayList<>();

    public void addCustomer(Account newCustomer) {
        customers.add(newCustomer);
    }
    public void depositToAccount(long accountNumber,float money){
        for (Account customer:customers) {
            if(customer.getAccountNumber()==accountNumber)
            {
                customer.depositingMoney(money);
                return ;
            }
        }
        throw new IllegalArgumentException("this transaction can't be done");
    }
    public void withdrawFromAccount(long accountNumber,float money){
        for (Account customer:customers) {
            if(customer.getAccountNumber()==accountNumber)
            {
                customer.withdrawingMoney(money);
                return ;
            }
        }
        throw new IllegalArgumentException("this transaction can't be done");
    }
    public float displayAccount(long accountNumber){
        for (Account customer:customers) {
            if(customer.getAccountNumber()==accountNumber)
            {
                return customer.getBalance();
            }
        }
        throw new IllegalArgumentException("Dear customer this account is not found");
    }
}
