package com.prectice.udemy;
import javax.swing.*;
import java.awt.*;
public class MyFirstJFrame {

    public static void main(String [] args){

        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setBounds(300,200,800,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My First Frame");
        frame.setResizable(false);
        frame.setLayout(null);
        Container c = frame.getContentPane();
        c.setBackground(Color.GRAY);
        Label label=new Label("UserName");
        c.add(label);
       label.setBounds(100,100,100,100);





    }
}
