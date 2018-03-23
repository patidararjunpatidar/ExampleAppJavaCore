package com.company;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIteratorExample {

    public static void main(String[] args) {
        CopyOnWriteArrayList list = new
                CopyOnWriteArrayList();
        list.add(22);
        list.add(44);
        list.add(99);
        list.add(78);
        list.add(96);
        list.add(88);
        list.add(12);
        list.add(31);
        int indexFlag=0;
        Iterator it= list.iterator();
        while (it.hasNext())
        {
          indexFlag++;
          if (indexFlag==4){
              list.remove(indexFlag);
          }
          System.out.println(it.next());
        }
        System.out.println("after removal of element");

        Iterator it2 = list.iterator();
        while (it2.hasNext())
        {
            System.out.println(it2.next());
        }
    }
}
