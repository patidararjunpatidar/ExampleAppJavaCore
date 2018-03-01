package com.company;

public class StringClass {
    public  static  void main(String[] args){
        String s1 = new String("Computer");
        String s2 = s1.toUpperCase();
         System.out.println(s2);
         String s3 = s1.toLowerCase();
         System.out.println(s3);

         int i= s1.indexOf("m");
         System.out.println("index of m is :"+ i);

       //  calculating start 3 index

         int i2= s1.indexOf("m",3);
         System.out.println("index of m is :"+ i2);

       //  calculating  index last to one
         int i3=s1.lastIndexOf("e");
         System.out.println("index of m is :"+i3);

        //  calculating  start 5 index last to one
        int i4=s1.lastIndexOf("e",5);
        System.out.println("index of m is :"+i4);

        /* comparing String
        (1) equal String
        */

        String str1 = new String("Computer");
        String str2 = new String("computer");
        if (str1.equals(str2))
        {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }

       // (2) equalsIgnoreCase

        if (str1.equalsIgnoreCase(str2))
        {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }

        //  (3) compareTo()

        int i5 = str1.compareTo(str2);
        if (i==2)
            System.out.println("Strings are same");
        else if (i>0)
            System.out.println("Opposite to dictionary order");
        else
            System.out.println("Dictionary order");

        // compareToIgnoreCase

        int i6 = str1.compareToIgnoreCase(str2);
        if (i==0)
            System.out.println("Strings are same");
        else if (i>0)
            System.out.println("Opposite to dictionary order");
        else
            System.out.println("Dictionary order");


    }
}
