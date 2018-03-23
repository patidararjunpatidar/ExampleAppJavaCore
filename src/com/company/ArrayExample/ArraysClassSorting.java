package com.company.ArrayExample;

import java.util.Arrays;

public class ArraysClassSorting{
    public static void main(String []args){

        int[] array = {100,101,106,107,104};
        System.out.println("Array Elements before sort");

        for(int elem:array){
            System.out.println(elem);
        }
        // call Arrays.sort on the int array.
        Arrays.sort(array);
        System.out.println("Array List After sort");
        for(int elem:array){
            System.out.println(elem);
        }
    }

}
