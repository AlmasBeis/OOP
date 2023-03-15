package com.example;

import java.util.Date;

public class TimeDepositAccount extends Account {
    
    
    
    public TimeDepositAccount(double balance, Date maturityDate) {
        super(balance);
        this.maturityDate = maturityDate;
    }
    //
    private final Date maturityDate;
    
    @Override
    public String toString() {
        return getDescription() + ": current balance is " + balance;
    }

    @Override
    public String getDescription() {
        return "Time Deposit Account " + maturityDate;
    }
    @Override
    public boolean withdraw(double amount){
        if (amount > 0 && this.balance >= amount){
            this.balance -= amount;
            return true;
        }else {
            System.out.println("erroer");
            return false;
        }
    }
}