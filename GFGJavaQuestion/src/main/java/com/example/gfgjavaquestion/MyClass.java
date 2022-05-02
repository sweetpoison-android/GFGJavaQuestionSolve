package com.example.gfgjavaquestion;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {

        Account account = new Account(1000);
        Customer c1 = new Customer(account, "santosh"), c2 = new Customer(account, "Sudhir");

       new Thread(c1).start();
       new Thread(c2).start();

    }

 }

 class Account
 {
     int bal;

     Account(int balance)
     {
         this.bal = balance;

     }

     public boolean isSufficientBalance(int withdrawal)
     {
         if (bal > withdrawal)
             return true;
         else return false;
     }

     public void withdraw(int amount)
     {
         bal -= amount;
         System.out.println("your withdrawal amount is "+ amount);
         System.out.println("your current balance is " +bal);
     }

 }

 class Customer implements Runnable
 {
     Account account;
     String name;

     Customer(Account clientAccount, String clientName)
     {
         this.account = clientAccount;
         this.name = clientName;
     }

     @Override
     public void run() {
         Scanner sc = new Scanner(System.in);

         synchronized (account)
         {
             System.out.println(name + ", Enter amount for withdrawal");
             int amount = sc.nextInt();

             if (account.isSufficientBalance(amount))
             {
                 account.withdraw(amount);
             }
             else System.out.println("Insufficient balance");
         }

     }
 }


