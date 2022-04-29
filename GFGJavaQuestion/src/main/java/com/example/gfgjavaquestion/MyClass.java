package com.example.gfgjavaquestion;

public class MyClass {

    public static void main(String[] args) {

      int ans[] =  returnMultipleValue(100, 16);
        System.out.println("Addition : " +ans[0]);
        System.out.println("Subtraction : " +ans[1]);
        System.out.println("Multiplication : " +ans[2]);
        System.out.println("Division : " +ans[3]);
        System.out.println("Remainder : " +ans[4]);



    }

   static int[] returnMultipleValue(int a, int b)
   {
      int result[] = new int[5];
      result[0] = a+b;
      result[1] = a-b;
      result[2] = a*b;
      result[3] = a/b;
      result[4] = a%b;

      return result;
   }

 }



