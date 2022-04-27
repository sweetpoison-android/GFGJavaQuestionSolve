package com.example.gfgjavaquestion;

import java.awt.print.Book;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.function.BiConsumer;

public class MyClass {



    public static void main(String[] args) {

        int arr[] = { 32, 65, 2, 6, 89, 67, 45, 54, 78, 34, 53, 12, 76, 49};

        Scanner sc = new Scanner(System.in);

        int index = linearSearch(arr, arr.length, 27);
        if (index == -1)
        {
            System.out.println("number not found");
        }
        else
        {
            System.out.println("number found at position : " + index);
        }


    }

    public static int linearSearch(int arr[], int length, int searchNumber)
    {
        for (int i=0; i<length; i++)
        {
           if (arr[i] == searchNumber)
           {
               return i;
           }
        }
        return -1;
    }

 }



