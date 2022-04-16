package com.example.gfgjavaquestion;

public class MyClass {

    public static void main(String[] args) {

        findFibonacciNumber(10);
        System.out.println();

    }

    public static void findFibonacciNumber(int n) {

        int firstNumber = 0;
        int secondNumber = 1;
        int sum = 0;
        System.out.println( firstNumber);
        System.out.println( secondNumber);

        for(int i=2; i<=n; i++)
        {
          sum = firstNumber+secondNumber;

            System.out.println(sum);

          firstNumber = secondNumber;
          secondNumber = sum;

        }

    }
}
