package com.company;

public class CalculateAverageExample {

    public static void main(String []args ){

        //define a Array and initialize with values

        int[] numbers = new int[]{22,20,41,55,16,60,100};

        /* Average value of array elements world be
            Sum of all elements/tools number of elements
         */

        // Calculate sum of all arrays elements

        int sum =0;

        for (int i=0;i<numbers.length;i++)
            sum = sum+numbers[i];

        //calculate average value
        float averege = sum /numbers.length;

        System.out.println("Average is:"+averege);
    }
}
