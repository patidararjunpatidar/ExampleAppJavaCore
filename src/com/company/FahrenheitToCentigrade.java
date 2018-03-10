package com.company;

import java.util.Scanner;

public class FahrenheitToCentigrade {
    public static void main(String[] args) {
        float fah;
        double cel;
        Scanner scanner = new Scanner(System.in);

        System.out .print("Enter Temperature in Fehrenheit : ");
        fah = scanner.nextFloat();
        cel=(fah-32)/1.8;
        System.out.println("Equivalant Temperature of "+cel+"in celsius"+ cel);
    }
}
