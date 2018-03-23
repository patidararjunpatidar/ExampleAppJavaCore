package com.company.GuiExample;

import javax.swing.*;

public class SwingClassExample extends JFrame{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,300);
       SwingClassExample se = new SwingClassExample();
       se.setComponents("arjun");

    }

    public void setComponents(String name){
        l1 = new JLabel("Addition of two number");
        l2 = new JLabel("Firsr Number");
        l3  = new JLabel("Second Number");
        l4= new JLabel("");
        t1= new JTextField();
        t2 = new JTextField();
        b1= new JButton("Add");

        setLayout(null);
        l1.setBounds(50,50,200,20);
        l2.setBounds(50,80,100,20);
        t1.setBounds(150,80,100,20);
        l3.setBounds(50,130,200,20);
        t2.setBounds(150,130,200,20);
        b1.setBounds(80,180,200,20);
        l4.setBounds(80,220,200,20);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
    }

}
