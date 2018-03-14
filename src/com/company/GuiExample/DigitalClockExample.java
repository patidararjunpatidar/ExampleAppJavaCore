package com.company.GuiExample;


import java.applet.Applet;
import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DigitalClockExample extends Applet implements Runnable{

    /* <applet code="MyApplet" width="300" height="300"> </applet> */

    Thread t,t1;
    public void start(){
        t=new Thread(this);
        t.start();
    }

    @Override
    public void run() {
      t1= Thread.currentThread();
      while (t1 == t){
          repaint();
          try{
              t1.sleep(1000);
          } catch (InterruptedException e) { }
      }
    }

    public void paint(Graphics g){
        Calendar cal =new GregorianCalendar();
        String hour  = String.valueOf(cal.get(Calendar.HOUR));
        String minute = String.valueOf(cal.get(Calendar.MINUTE));
        String second = String.valueOf(cal.get(Calendar.SECOND));
        g.drawString(hour+":"+minute+":"+second,20,30);
    }
}