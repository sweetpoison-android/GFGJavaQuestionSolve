package com.example.gfgjavaquestion;

public class MyClass {

    public static void main(String[] args) {

        findNeonNumberBetweenRange(1, 10000);
        System.out.println();

    }

    public static void findNeonNumberBetweenRange(int a, int b) {

        int sum = 0;
        int square = 0;

        for (int i = a; i <= b; i++) {
                  square = i*i;
            while (square > 0) {
                int result = square % 10;
                sum += result;
                square = square / 10;
            }

            if (sum == i) {
                System.out.println(i+"");
            } else {
                System.out.println("not found");
            }

        }
    }
}
