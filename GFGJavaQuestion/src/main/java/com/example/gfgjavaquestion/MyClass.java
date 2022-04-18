package com.example.gfgjavaquestion;

public class MyClass {

    public static void main(String[] args) {

        reversePyramidStarPattern(5);

    }

    public static void reversePyramidStarPattern(int number) {

        for(int i = number; i >= 1; i--)
        {

            // Inner loop print space
            for(int j = i; j < number; j++)
            {
                System.out.print("  ");
            }

            // Inner loop print star
            for(int j = 1; j <= (2 * i - 1); j++)
            {
                System.out.print(" *");
            }

            // Ending line after each row
            System.out.println("");
        }

    }
}
