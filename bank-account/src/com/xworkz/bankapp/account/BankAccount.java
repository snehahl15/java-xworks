package com.xworkz.bankapp.account;

import com.xworkz.bankapp.account.current.CurrentAccount;
import com.xworkz.bankapp.account.salary.SalaryAccount;
import com.xworkz.bankapp.account.savings.SavingsAccount;

public class BankAccount {

    double balance;

    public double  getBalance(){
        return balance;



    }
    public void credit(double amount){
        System.out.println("credit initialized:");
        if(amount>0)
            balance = balance + amount;
        else
            System.out.println("invalid amount:");
        System.out.println("credited successfully");


    }
    public void debit(double amount ){
        System.out.println("debit initialized");
        if(amount <=balance)
            balance = balance-amount;
        else System.out.println("insufficient balance");
        System.out.println("debited successfully");

    }
    public void transfer(BankAccount beneficiaryAccount,double amount) {
        this.debit(amount);
        beneficiaryAccount.credit(amount);


    }
}
