package com.example.gfgjavaquestion;

public class MyClass {

    public static void main(String[] args) {

        pyramidStarPattern(5);

    }

    public static void pyramidStarPattern(int n) {

    for (int i=0; i<n; i++)
    {
        for (int j = n-i; j>1; j--)
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
