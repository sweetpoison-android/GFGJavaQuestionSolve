package com.example.gfgjavaquestion;

import java.util.Arrays;

public class MyClass {

    /* Driver program to test above function */
    public static void main(String args[]) {

        int[] number = {34, 78, 56, 68, 24, 9, 60, 45, 34, 67, 23};

        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        Pair minMax = new Pair();
        minMax = minMax.getMinMax(number, number.length);
        System.out.println("Max no : " + minMax.max + "\nMin No : " + minMax.min);

    }

}

class Pair {
    int min;
    int max;

    public Pair getMinMax(int[] arr, int length) {
        Pair minMax = new Pair();

        if (length == 1) {
            minMax.max = arr[0];
            minMax.min = arr[0];
            return minMax;
        }
        if (arr[0] > arr[1]) {
            minMax.max = arr[0];
            minMax.min = arr[1];
        } else {
            minMax.max = arr[1];
            minMax.min = arr[0];
        }

        for (int i = 2; i < length; i++) {
            if (arr[i] > minMax.max) {
                minMax.max = arr[i];
            } else if (arr[i] < minMax.min) {
                minMax.min = arr[i];
            }
        }

        return minMax;
    }
}




