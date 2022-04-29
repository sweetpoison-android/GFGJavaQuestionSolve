package com.example.gfgjavaquestion;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        GetResult ans = GetResult.getAns(a, b);
        System.out.println("Addition : "+ ans.sum);
        System.out.println("Subtraction : "+ ans.sub);
        System.out.println("Multiplication : "+ ans.mul);
        System.out.println("Division : "+ ans.div);
        System.out.println("Remainder : "+ ans.remain);

    }

 }

  class GetResult
  {
      int sum,sub,mul,div,remain;

      GetResult(int addition, int subtraction,int multiply, int divide, int remainder)
      {
          this.sum = addition;
          this.sub = subtraction;
          this.mul = multiply;
          this.div = divide;
          this.remain = remainder;
      }

      public static GetResult getAns(int a, int b)
      {
          return new GetResult(a+b, a-b, a*b, a/b, a%b);
      }
  }



