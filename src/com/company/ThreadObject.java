package com.company;

public class ThreadObject {
    public static  void main(String[]args){

      A o1 = new A();
      B o2 = new B();
      o1.start();
      o2.start();


    }
    static class A extends Thread{

        @Override
        public void run() {

            int i;
            for(i=0;i<=10;i++){
                System.out.println("Thread A :"+i);
        }

        }

    }
    static class B extends Thread{

        @Override
        public void run() {

            int i;
            for(i=0;i<=10;i++){
                System.out.println("Thread B :"+i);
            }

        }

    }
}
