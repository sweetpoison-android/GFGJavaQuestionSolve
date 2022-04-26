package com.example.gfgjavaquestion;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class MyClass {

    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet(new MyComparator());
        treeSet.add(new Book("Java", 1000));
        treeSet.add(new Book("Python", 700));
        treeSet.add(new Book("Kotlin", 500));
        treeSet.add(new Book("Ruby", 900));
        treeSet.add(new Book("c++", 300));
        treeSet.add(new Book(".net", 1500));

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext())
        {
            Book b = (Book) iterator.next();
            System.out.println(b.getTitle() + " \t " + b.getPrice());
        }


    }


 }
class Book
{
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

class MyComparator implements Comparator {

    @Override
    public int compare(Object o, Object t1) {
        Book b1, b2;

        b1 = (Book) o;
        b2 = (Book) t1;

        if (b1.getPrice() < b2.getPrice()) {
            return -1;
        } else {
            return 1;
        }
    }
}