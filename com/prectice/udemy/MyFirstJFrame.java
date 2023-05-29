package com.prectice.udemy;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFirstJFrame implements ActionListener {
    JButton signIn, clear, signUp;
    JTextField cardNuTextField;
    JPasswordField PinNuTextField;
    MyFirstJFrame(){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setBounds(300, 100, 500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My First Frame");
        frame.setResizable(false);
        frame.setLayout(null);
        Container c = frame.getContentPane();
        c.setBackground(Color.LIGHT_GRAY);


        //Adding image here


        ImageIcon icon = new ImageIcon("E:\\My Java Programs\\Login\\icons\\MyLogo.jpg");
        Image i2 = icon.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(i2));

        frame.add(label);
        label.setBounds(60, 0, 200, 100);
//This is for print headline on  top

        JLabel text = new JLabel("WELCOME TO ATM", JLabel.CENTER);
        text.setBounds(150, 0, 300, 100);
        frame.add(text);
        Font font = new Font("Arial", Font.BOLD, 30);
        text.setFont(font);

//This is for print cardnu text bottom  to headline
        JLabel cardNu = new JLabel("Card No:");
        cardNu.setBounds(35, 165, 200, 100);
        frame.add(cardNu);
        Font font2 = new Font("Arial", Font.BOLD, 20);
        cardNu.setFont(font2);

//This code for creat TextField for Card No
        cardNuTextField = new JTextField();
        cardNuTextField.setBounds(140, 200, 300, 30);
        Font fontCard = new Font("Arial", Font.BOLD, 20);
        cardNuTextField.setFont(fontCard);
        frame.add(cardNuTextField);


        //This is for print Pin text bottom  to headline
        JLabel Pin = new JLabel("Pin  No:");
        Pin.setBounds(40, 250, 300, 100);
        frame.add(Pin);
        Font font3 = new Font("Arial", Font.BOLD, 20);
        Pin.setFont(font3);

        //This code for creat TextField for pin
        PinNuTextField = new JPasswordField();
        Font fontPass = new Font("Arial", Font.BOLD, 20);
        PinNuTextField.setFont(fontPass);
        PinNuTextField.setBounds(140, 285, 300, 30);

        frame.add(PinNuTextField);


//This code for create Button Sign in
        signIn = new JButton("Sign in");
        signIn.setBounds(140, 350, 150, 30);
        signIn.setBackground(Color.BLACK);
        signIn.setForeground(Color.WHITE);
        signIn.addActionListener(this);
        frame.add(signIn);


        //This code for create Button Clear
        clear = new JButton("Clear");
        clear.setBounds(290, 350, 150, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        frame.add(clear);

//This code for create Sign Up Button

        signUp = new JButton("Sign UP");
        signUp.setBounds(140, 400, 300, 30);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);
        signUp.addActionListener(this);

        frame.add(signUp);
    }

    public static void main(String[] args) {
    new MyFirstJFrame();
        //Lenovo V15
        //ASUS VIVOBOOK 15


    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == signIn) {


        }else if(ae.getSource()==clear){
            cardNuTextField.setText("");
            PinNuTextField.setText("");
        }else if(ae.getSource()==signUp){

        }
    }
}

