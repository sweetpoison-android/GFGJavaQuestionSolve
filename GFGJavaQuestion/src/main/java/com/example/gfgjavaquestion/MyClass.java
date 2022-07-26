package com.example.gfgjavaquestion;

import java.util.Arrays;
import java.util.Scanner;

public class MyClass {

    public static void main(String[] args)  {
//
//        Scanner st = new Scanner(System.in);
//          System.out.println("Enter first number");
//          int a = st.nextInt();
//        System.out.println("Enter second number");
//        int b = st.nextInt();

        neonNumber(1, 10000);

    }

    public static void neonNumber(int a, int b) {


        int square;
        int sum;
        boolean isNeon;

        for (int i= a; i<= b; i++)
        {
            sum = 0;
            square = i*i;

            while (!(square <= 0))
            {

                int result = square%10;
                sum = sum+result;
                square = square/10;

            }
            if (i == sum)
            {
               isNeon = true;
            }
            else
            {
                isNeon = false;
            }

            if (isNeon)
            {
                System.out.println(i);
            }

        }
        }

    }



