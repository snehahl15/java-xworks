package com.xworkz.bankapp;

import com.xworkz.bankapp.account.BankAccount;
import com.xworkz.bankapp.account.current.CurrentAccount;
import com.xworkz.bankapp.account.salary.SalaryAccount;
import com.xworkz.bankapp.account.savings.SavingsAccount;

public class BankAccountRunner {
    public static void main(String[] args) {
    System.out.println("main started");
     //salary account object creation
      SalaryAccount snehaAccount = new SalaryAccount();
      snehaAccount.credit(1000);
      double snehaBalance =  snehaAccount.getBalance();
      System.out.println("Balance:"+snehaBalance);

      snehaAccount.debit(100);
      snehaBalance =  snehaAccount.getBalance();
      System.out.println("Balance:"+snehaBalance);


//current account object creation
        System.out.println("--------------------------");
        CurrentAccount motherAccount = new CurrentAccount();
        motherAccount.credit(10000);
         double motherBalance = motherAccount.getBalance();
         System.out.println("Balance:"+motherBalance);

        System.out.println("--------------------------");

         //Savings account object creation
        SavingsAccount fatherAccount = new SavingsAccount();
        fatherAccount.credit(90000);
        double fatherBalance =  fatherAccount.getBalance();
        System.out.println("Balance:"+fatherBalance);

        System.out.println("--------------------------");
        fatherAccount.transfer(motherAccount,1000);
        motherBalance = motherAccount.getBalance();
        System.out.println("Balance:"+motherBalance);


        System.out.println("--------------------------");
        BankAccount b = new SavingsAccount();
        b.credit(100);
         double bBalance = b.getBalance();
         System.out.println("Balance:"+bBalance);


    System.out.println("main ended");


    }
}
