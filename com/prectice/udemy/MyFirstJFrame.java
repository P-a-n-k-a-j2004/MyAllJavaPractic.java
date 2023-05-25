package com.prectice.udemy;
import javax.swing.*;
import java.awt.*;
public class MyFirstJFrame {

    public static void main(String [] args){

        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setBounds(300,100,800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My First Frame");
        frame.setResizable(false);
        frame.setLayout(null);
        Container c = frame.getContentPane();
        c.setBackground(Color.LIGHT_GRAY);


        //Adding image here


        ImageIcon icon=new ImageIcon("E:\\My Java Programs\\Login\\icons\\MyLogo.jpg");
        Image i2=icon.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        JLabel label=new JLabel();
        label.setIcon(new ImageIcon(i2));

        frame.add(label);
        label.setBounds(200,0,200,100);
//This is for print headline on  top

        JLabel text=new JLabel("WELCOME TO ATM",JLabel.RIGHT);
        text.setBounds(210,0,300,100);
        frame.add(text);
        Font font=new Font("Arial",Font.BOLD,20);
        text.setFont(font);

//This is for print cardnu text bottom  to headline
        JLabel cardnu=new JLabel("Card No:");
        cardnu.setBounds(150,150,200,100);
        frame.add(cardnu);
        Font font2=new Font("Arial",Font.ITALIC,20);
        cardnu.setFont(font2);
        JTextField cardNuTextField=new JTextField();
        cardNuTextField.setBounds(250,180,300,30);
        frame.add(cardNuTextField);



        //This is for print Pin text bottom  to headline
        JLabel Pin=new JLabel("Pin No:");
        Pin.setBounds(150,200,300,100);
        frame.add(Pin);
        Font font3=new Font("Arial",Font.ITALIC,20);
        Pin.setFont(font3);
        JTextField PinNuTextField=new JTextField();
        PinNuTextField.setBounds(250,230,300,30);
        frame.add(PinNuTextField);

//This code for create Button Sign in
        JButton signIn=new JButton("Sign in");
        signIn.setBounds(250,300,150,30);
        frame.add(signIn);
 //This code for create Button Clear
        JButton clear=new JButton("Clear");
        clear.setBounds(400,300,150,30);
        frame.add(clear);
        JButton signUp=new JButton("Sign UP");
       signUp.setBounds(400,400,150,30);
        frame.add(signUp);
        //Lenovo V15
        //ASUS VIVOBOOK 15





    }
}
