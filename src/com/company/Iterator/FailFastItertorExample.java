package com.company.Iterator;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class FailFastItertorExample {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(22);
        list.add(44);
        list.add(99);
        list.add(78);
        list.add(96);
        list.add(88);
        int indexFlag=0;
        Iterator it = list.iterator();
        while(it.hasNext())
        {
            indexFlag++;
            if (indexFlag==4){
                list.remove(indexFlag);
            }
            System.out.println(it.next());
        }

    }
}
