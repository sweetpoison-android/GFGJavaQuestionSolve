package com.example.gfgjavaquestion;

public class MyClass {

    public static void main(String[] args) {

        mirrorUpperStarTrianglePattern(5);

    }

    public static void mirrorUpperStarTrianglePattern(int number) {

   upperPartOfPyramidTriangle(5);
   lowerPartOfPyramidTriangle(5);

    }

    public static void upperPartOfPyramidTriangle(int number)
    {
        int m, n;

        for (m = number - 1; m >= 0; m--) {

            // Inner loop 1
            for (n = 0; n < m; n++) {

                // Printing whitespace
                System.out.print(" ");
            }

            // Inner loop 2
            for (n = m; n <= number - 1; n++) {

                // Printing star with whitespace
                System.out.print("*"
                        + " ");
            }

            // By now we are done with one row so new line
            System.out.println();
        }
    }

    public static void lowerPartOfPyramidTriangle(int number)
    {
        int m, n;

        // Outer loop for rows
        for (m = 1; m <= number; m++) {

            // Inner loop 1
            for (n = 1; n < m; n++) {

                // Printing whitespace
                System.out.print(" ");
            }

            // Inner loop 2
            for (n = m; n <= number; n++) {

                // Printing star and whitespace
                System.out.print("*"
                        + " ");
            }

            // By now we are done with one row so new line
            System.out.println();
        }
    }
}
