package com.example.gfgjavaquestion;

import java.awt.print.Book;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class MyClass {

    public static void main(String[] args) {

        MyInfo myInfo = new MyInfo("santosh", "Android developer", "Bihar");

        System.out.println("From Constructor");

        System.out.println("My name is "+myInfo.getName());
        System.out.println("Mt profession is "+myInfo.getProfession());
        System.out.println("I am from "+myInfo.getAddress());

        myInfo.setName("Manish Malhotra");
        myInfo.setProfession(".net Developer");
        myInfo.setAddress("Delhi");

        System.out.println("From getter setter method");

        System.out.println("My name is "+myInfo.getName());
        System.out.println("Mt profession is "+myInfo.getProfession());
        System.out.println("I am from "+myInfo.getAddress());


    }
 }

 class MyInfo
 {
     String name, profession, address;
     MyInfo(String sName, String strProfession, String strAddress)
     {
      this.name = sName;
      this.profession = strProfession;
      this.address = strAddress;
     }

     public String getName()
     {
         return name;
     }
     public void setName(String strName)
     {
         this.name = strName;
     }
     public String getProfession()
     {
         return profession;
     }
     public void setProfession(String strProfession)
     {
        this.profession = strProfession;
     }

     public String getAddress()
     {
         return address;
     }
     public void setAddress(String strAddress)
     {
         this.address = strAddress;
     }
 }

