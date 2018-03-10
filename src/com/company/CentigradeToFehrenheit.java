package com.company;

import java.util.Scanner;

public class CentigradeToFehrenheit {
    public static void main(String[] args) {
        float feh;
        Double cel;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Centigrade value");
        cel = scanner.nextDouble();

        feh= (float) ((1.8*cel)+32);

        System.out.println("Equivak=lant Temperature of "+cel+"in Fehrenheit = "+feh);
    }
}
