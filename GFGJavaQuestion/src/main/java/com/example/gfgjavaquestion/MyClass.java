package com.example.gfgjavaquestion;

public class MyClass {

    public static void main(String[] args) {

        checkNeonNumber(9);
        System.out.println();

    }

    public static void checkNeonNumber(int a) {

        int sum=0;
        int square =0;
        square = a*a;

        while (square>0)
        {
            int result = square%10;
            sum +=result;
            square = square/10;
        }

        if (sum == a)
        {
            System.out.println("number is neon");
        }
        else
        {
            System.out.println("number is not neon");
        }

    }
}
