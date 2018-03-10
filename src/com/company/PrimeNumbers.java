package com.company;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int i =0;
        int num= 0;

        String primeNumber ="";
        System.out.println("input your number to which you want to print all prime numbers and press enter:");

        Scanner scanner = new Scanner(System.in);
         int boundryNum =scanner.nextInt();

         for (i=1;i<=boundryNum;i++){
             int counter = 0;
             for (num=i;num>=1;num--){
                 if(i%num==0){
                     counter= counter+1;
                 }
             }
             if (counter==2){
                 System.out.println(i+"is a prime number");
             }
         }
    }

}
