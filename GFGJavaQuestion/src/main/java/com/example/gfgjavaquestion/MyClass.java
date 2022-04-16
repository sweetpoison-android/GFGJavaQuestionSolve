package com.example.gfgjavaquestion;

public class MyClass {

    public static void main(String[] args) {

      printRightTriangle(5);

    }

    public static void printRightTriangle(int n) {

     for (int i=0; i<=n; i++)
     {
        for (int j=0; j<=i; j++)
        {
            System.out.print(" *");
        }
         System.out.println(" ");
     }

    }
}
