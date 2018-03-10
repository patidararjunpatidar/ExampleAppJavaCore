package com.company;

import java.util.Scanner;

public class ReverseNumberWhile {
    public static void main(String[] args) {
        int num=0,tempNum;
        int reversenum =0;
        System.out.println("Enter Your number and press enter:");
        //This statement will capure user input after enter clicked

        Scanner input = new Scanner(System.in);

        //Entered input would be stored in number num

        tempNum = num=input.nextInt();

         //While loop :find out the reverse number

        while (num!=0){
            reversenum = reversenum*10;
            reversenum = reversenum+num%10;
            num=num/10;
        }
        System.out .println("Reverse of input number "+tempNum+"is"+reversenum);
    }
}
