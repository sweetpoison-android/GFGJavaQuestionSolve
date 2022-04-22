package com.example.gfgjavaquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MyClass {

    public static void main(String[] args) {

      Integer[] array = new Integer[]{54, 98, 23, 56, 38, 23, 19, 50, 32, 54, 23, 98};

        Arrays.sort(array, Collections.<Integer>reverseOrder());  // for ascending order sorting
        System.out.println("sorting an array : "+Arrays.toString(array));

        ArrayList<Integer> arrayList = new ArrayList<>();
       Collections.addAll(arrayList, array);

        HashSet<Integer> hashSet = new HashSet<Integer>(arrayList);

        System.out.println("remove duplicate : "+hashSet);

        TreeSet<Integer> treeSet = new TreeSet<Integer>(hashSet);

        System.out.println("sorting arraylist after removed duplicate "+treeSet);

        int i=0;

        int[] arr = new int[treeSet.size()];
        for ( int ese : treeSet)
        {
            arr[i++] = ese;

        }
        System.out.println("Second highest value of array : "+arr[arr.length-2]);

    }



}
