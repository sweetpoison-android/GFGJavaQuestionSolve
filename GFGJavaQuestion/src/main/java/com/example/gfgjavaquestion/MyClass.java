package com.example.gfgjavaquestion;

public class MyClass {

    public static void main(String[] args)
    {
     swapNumberByThirdVariable(1, 5);
    }

   public static void swapNumberByThirdVariable(int a, int b)
    {
        int thirdNumber =0;
        thirdNumber = a;

        a=b;

        b= thirdNumber;

        System.out.println("a : "+a);
        System.out.println("b : "+b);

    }
}