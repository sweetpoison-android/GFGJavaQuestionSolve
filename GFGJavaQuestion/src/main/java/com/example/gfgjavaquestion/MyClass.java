package com.example.gfgjavaquestion;

public class MyClass {

    public static void main(String[] args) {

        printLeftTriangle(5);

    }

    public static void printLeftTriangle(int n) {

     for (int i=0; i<n; i++)
     {

         for (int j=2*(n-i); j>=0; j-- )
         {
             System.out.print(" ");
         }

        for (int j=0; j<=i; j++)
        {
            System.out.print("* ");
        }
         System.out.println();
     }

    }
}
