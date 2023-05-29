package com.prectice.udemy;

import javax.swing.*;
import java.awt.*;

public class SignUpPage extends JFrame {
    SignUpPage(){
        setSize(800,500);
        setLocation(350,10);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       // setResizable(false);
        setLayout(null);
      //  ImageIcon myIcon=new ImageIcon("E:\\My Java Programs\\Login\\icons\\MyLogo.jpg");
        
        setTitle("                  WELCOME TO SIGN UP    ");
        ImageIcon icons=new ImageIcon("E:\\My Java Programs\\Login\\icons\\MyPhoto.jpg");

        JLabel label = new JLabel();
        label.setIcon(icons);
        label.setSize(label.getHeight(),label.getWidth());
        

        add(label);




    }
    public static void main(String [] args){
        new SignUpPage();
    }
}
