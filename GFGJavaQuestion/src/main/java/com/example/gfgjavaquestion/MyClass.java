package com.example.gfgjavaquestion;

public class MyClass {

    public static void main(String[] args) {

        findArmStrongNumber(50, 1000);
        System.out.println();

    }

    public static void findArmStrongNumber(int a, int b) {

        for (int j = a + 1; j < b; ++j) {

            // Calculating number of digits

            int y = j;
            int N = 0;
            while (y != 0) {
                y /= 10;
                ++N;
            }
            // Calculating the sum of nth
            // power of all the digits

            int sum_power = 0;
            y = j;
            while (y != 0) {
                int d = y % 10;
                sum_power += Math.pow(d, N);
                y /= 10;
            }

            // Checking if the current number
            // i is equal to the sum of nth
            // power of all the digits

            if (sum_power == j)
                System.out.print(j + " ");

        }



    }
}
