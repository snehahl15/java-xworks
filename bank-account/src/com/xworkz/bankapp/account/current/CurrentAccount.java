package com.xworkz.bankapp.account.current;

import com.xworkz.bankapp.account.BankAccount;

public class CurrentAccount extends BankAccount {
     double overDraftLimit;
    double balance;

    public void debit(double amount ){
        System.out.println("CurrentAccount debit initialized:");

        if(amount <= balance && amount <= (balance+overDraftLimit)) {
            balance = balance -amount;
            System.out.println("Debited successfully from Current Account. New balance: " + balance);

        }else
            System.out.println("Transaction failed: Overdraft limit exceeded!");
        }

    }

