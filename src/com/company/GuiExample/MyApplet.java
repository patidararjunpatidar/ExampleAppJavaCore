package com.company.GuiExample;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyApplet extends Applet{
    /* <applet code="MyApplet" width="300" height="300"> </applet> */

    Label l1,l2,l3;
    TextField t1,t2;
    Button btn;

    public  void init() {
        l1 = new Label("First Number");
        l2 = new Label("Second Number");
        l3 = new Label();
        t1 = new TextField();
        t2 = new TextField();
        btn = new Button("Add");

        setLayout(null);
        l1.setBounds(30,50,100,20);
        t1.setBounds(150,50,100,20);
        l2.setBounds(30,100,100,20);
        t2.setBounds(150,100,100,20);
        btn.setBounds(100,150,80,20);
        l3.setBounds(100,180,100,20);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(btn);
        add(l3);
        btn.addActionListener(new MyHandler());
    }

    public class MyHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int a,b,c;
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
            c= a+b;
            l3.setText("Sum is :"+c);
        }
    }
}
