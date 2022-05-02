package com.example.gfgjavaquestion;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long sum = 0,  r, temp;

        System.out.println("Enter number for palindrome check");
     long a = sc.nextLong();

     temp = a;

   while (a>0)
   {
       r = a%10;
       sum = (sum*10)+r;
       a = a/10;
   }

        System.out.println(sum);  // reversed integer

   if (sum == temp)
   {
       System.out.println(temp + " is a palindrome number");
   }
   else
   {
       System.out.println(a+ " is not a palindrome number");
   }

    }

 }


