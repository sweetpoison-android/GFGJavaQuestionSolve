package com.example.gfgjavaquestion;

public class MyClass {

    public static void main(String[] args) {

       double SI = findCompoundInterest(5765, 5, 2);
        System.out.println("Simple interest : "+SI);

    }

    public static double findCompoundInterest(double p, double r, double t) {

      double compoundInterest = p*(Math.pow((1+r/100), t));

       return compoundInterest;

    }
}
