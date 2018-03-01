package com.company;

import java.util.Random;

public class RandomNumberGenerator {
    public  static  void main(String[] args){
        int i;
        Random r = new Random();
        System.out.println("5 Random Number :");
        for (i=0;i<=4;i++){
            System.out.println(r.nextInt(50));
        }

    }
}
