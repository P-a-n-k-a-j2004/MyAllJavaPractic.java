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

        frame.setLayout(null);
        Container c = frame.getContentPane();
        c.setBackground(Color.GRAY);
//        Label label=new Label("UserName");
//        c.add(label);
//       label.setBounds(100,100,200,100);
//       label.setText("password");//ThinkBook 31000
//        Font font =new Font("Arial",Font.PLAIN,20);
//        label.setFont(font);

        //Adding image here
        ImageIcon icon=new ImageIcon("MyLogo.jpg");

        JLabel label=new JLabel(icon);
        label.setBounds(100,50,icon.getIconWidth(),icon.getIconHeight());
        label.setLayout(null);

        //Lenovo V15
        //ASUS VIVOBOOK 15





    }
}
