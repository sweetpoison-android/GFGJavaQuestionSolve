package com.example.gfgjavaquestion;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MyClass {

    /* Driver program to test above function */
    public static void main(String args[]) {

        int arr[] = {100,33,88, 56, 44, 90, 110, 33, 22, 66};
        printArray(arr, arr.length);
        System.out.println("");
        reverseArray(arr, 0, arr.length-1);
        printArray(arr, arr.length);

    }

    public static void reverseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end)
        {
           temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
        }
    }
    public static void printArray(int arr[], int length)
    {
        for (int i =0; i<length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

 }




