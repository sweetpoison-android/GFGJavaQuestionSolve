package com.example.gfgjavaquestion;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MyClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = "";
        String reverseWord = "";
        char ch;

        System.out.println("Enter anything");

           word = scanner.nextLine();

        for (int i=0; i<word.length(); i++)
        {
            ch = word.charAt(i);
            reverseWord = ch+reverseWord;
        }

        System.out.println(reverseWord+" : it is reversed");
    }
    }
