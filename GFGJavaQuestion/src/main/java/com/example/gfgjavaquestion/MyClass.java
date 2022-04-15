package com.example.gfgjavaquestion;

public class MyClass {

    public static void main(String[] args)
    {
        findPrimeNumberFromGivenRange(1, 100);

    }

   public static void findPrimeNumberFromGivenRange(int a, int b)
    {
        int isDivided, count = 0;

        for (int i=a; i<=b ; i++)
        {
            if (i == 0 || i==1)
                continue;

            isDivided = 1;
            for (int j=2; j<=i/2; j++)
            {
                if (i%j == 0)
                {
                    isDivided = 0;
                    break;
                }

            }

            if (isDivided == 1)
            {
                System.out.println(i);
               count++;

            }

        }
        System.out.printf("Total prime number"+count);
        }
    }

