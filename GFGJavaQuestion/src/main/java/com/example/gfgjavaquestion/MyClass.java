package com.example.gfgjavaquestion;

public class MyClass {

    public static void main(String[] args)
    {
        swapTwoNumber(5, 1);
    }

   public static void swapTwoNumber(int a, int b)
    {
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a : "+a);
        System.out.println("b : "+b);

    }
}