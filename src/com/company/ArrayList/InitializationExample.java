package com.company.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class InitializationExample {
    public static void main(String[] args) {
        ArrayList<String> obj =  new ArrayList<String>(
                Arrays.asList("Arjun patidar", "Anubhav jain","Atherva kultarni")
        );
        System.out.println("Elements are:"+obj);
    }
}
