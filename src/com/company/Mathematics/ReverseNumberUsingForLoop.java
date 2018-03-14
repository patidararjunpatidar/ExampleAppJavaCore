package com.company.Mathematics;

import java.util.Scanner;

public class ReverseNumberUsingForLoop {
    public static void main(String[] args) {
        int num=0,tempNum;
        int reversenum=0;

        System.out.println("input your number and press enter");

        Scanner scanner= new Scanner(System.in);
        tempNum = num=scanner.nextInt();

        for (;num!=0;) {
            reversenum = reversenum * 10;
            reversenum = reversenum + num % 10;
            num = num / 10;
        }

        System.out.println("Reverse number of : "+tempNum+" is "+reversenum);
    }
}
