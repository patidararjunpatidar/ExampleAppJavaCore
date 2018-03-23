package com.company.ArrayExample;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String []args){

        int[] array1 = {10,20,30};
        int[] array2={100,200,300};

        //Print the two arrays with for-loops

        int[] merge = new int[array1.length+array2.length];

        for (int i=0;i<array1.length;i++){
            merge[i] = array1[i];
        }

        for (int i=0;i<array2.length;i++){
            merge[i+array1.length] =array2[i];
        }

        //print the merged Array.
        System.out.println(Arrays.toString(merge));
    }
}
