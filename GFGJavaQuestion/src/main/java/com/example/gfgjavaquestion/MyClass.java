package com.example.gfgjavaquestion;

public class MyClass {

    public static void main(String[] args)
    {
       int largest = findLargestNumberInThreeNumber(12, 754, 98);
        System.out.println( largest);
    }

   public static int findLargestNumberInThreeNumber(int a, int b, int c)
    {
      if (a>b && a>c)
      {
          return a;
      }
      else if (b>a && b>c)

      {
          return b;
      }
      else
      {
          return c;
      }

    }
}