package com.example.gfgjavaquestion;

import java.util.Arrays;
import java.util.Collections;

public class MyClass {

    public static void main(String[] args) {

      Integer[] array = new Integer[]{54, 98, 23, 56, 38, 23, 19, 50, 32, 54};

        Arrays.sort(array);  // for ascending order sorting
        System.out.println(Arrays.toString(array));

//        Arrays.sort(array, 2, 5);  // for range sorting last index not count
//        System.out.println(Arrays.toString(array));

//        Arrays.sort(array, Collections.reverseOrder());
//        System.out.println(Arrays.toString(array));

//        for (int i : array)
//        {
//            System.out.print(i+" , ");
//        }

    }


}
