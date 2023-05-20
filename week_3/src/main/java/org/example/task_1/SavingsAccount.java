package org.example.task_1;

public class SavingsAccount extends Account{
    private float interestRate;
    public SavingsAccount(long accountNumber, String accountHolderName, int balance) {
        super(accountNumber, accountHolderName, balance);
    }
    public float calculateInterest(float numberOfYears){
        return interestRate*getBalance()*numberOfYears;
    }
    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

}
