package com.company.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

    public class LoopExample {
        public static void main(String[] args) {
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            arrayList.add(14);
            arrayList.add(7);
            arrayList.add(39);
            arrayList.add(40);


            System.out.println("For Lopp");
            for (int counter = 0; counter<arrayList.size();counter++){
                System.out.println(arrayList.get(counter));
            }

            System.out.println("Advance for loop");
            for (Integer num :arrayList){
                System.out.println(num);
            }

            System.out.println("While Loop");
            int count = 0;
            while(arrayList.size() > count){
                System.out.println(arrayList.get(count));
                count++;
            }

            System.out.println("Array list using Iterator");
            Iterator it =arrayList.iterator();
            while (it.hasNext())
            {
                System.out.println(it.next());
            }

        }


    }

