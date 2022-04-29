package com.example.gfgjavaquestion;


public class MyClass {

    public static void main(String[] args) {

        System.out.println(getFactorial(6));

    }

    static int getFactorial(int a)
    {
        if (a == 0 || a == 1)
        {
            return 1;
        }
        return a*getFactorial(a-1);
    }
 }



