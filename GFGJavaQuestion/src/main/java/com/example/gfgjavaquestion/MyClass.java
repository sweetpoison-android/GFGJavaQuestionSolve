package com.example.gfgjavaquestion;

import java.util.Arrays;

public class MyClass {

    public static void main(String[] args)  {

       int[] number = {2,4,2,7,3,2,4,8,9,3,5, 7, 3, 5, 2, 9, 5, 8, 3, 4, 5, 9, 1,5, 8, 3, 2, 8, 0, 9, 6};
       int count;

       int a,b;

        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
       // [0, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 5, 6, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9]

        for (int i=0; i< number.length; i++)
        {
            a = number[i];

            count = 1;

            for (int j =i+1; j< number.length; j++)
            {
               b = number[j];

                if (a == b)
                {
                    count++;

                }
                else
                {
                    break;
                }

            }

               System.out.println(number[i] +" : "+count);
               i = i+(count-1);

        }

    }

}


