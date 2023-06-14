package com.Youtube.FileHandling;

import java.util.Scanner;
import java.io.*;
import java.io.IOException;

public class LoginPage {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        FileWriter myFile;
        System.out.println("Enter You want to login or SignUp");
        String choice=sc.nextLine();
        switch (choice) {


            case "SignUp" , "signup": try {
                 myFile = new FileWriter("SignUp.txt");
                System.out.print("\t\t\t\tEnter you Name: ");
                String name = sc.nextLine();
                System.out.print("\n\t\t\t\tEnter Your Email or phone: ");
                String email = sc.nextLine();
                System.out.print("\n\t\t\t\tEnter Your Mobil No: ");
                long mobil = sc.nextLong();

                System.out.println("Which Button you want to click Login or singUp,if You want login then press 1 and " +
                        "SignUp then press 2");
                String ch = sc.nextLine();
                if(ch=="SignUp"|| ch=="signup"||ch=="signUp"||ch=="SIGN UP"||ch=="SIGNUP"||ch=="sign up"||ch=="sign Up") {

                    System.out.println("check signUp");
                    System.out.println("You Are SuccessFully SignUp..");

                    myFile.write("\n========================================================================Hii " + name + "========================================================================\t\t");
                    myFile.write("\n\n*****************************************************************WELCOME TO OVER PAGE*********************************************************************\t\t");
                    myFile.write("\n\n\t\t\t                        UserName:                                             " + name);
                    myFile.write("\n====================================================================================================================================================================");
                    myFile.write("\n\n\t\t\t                        Email Address:                                        " + email);
                    myFile.write("\n====================================================================================================================================================================");

                    myFile.write("\n\n\t\t\t                        Mobile No:                                            " + mobil);
                    myFile.write("\n====================================================================================================================================================================");

                    myFile.write("      \n\n\n   \n                                               Congratulation For Creating Your Account here");
                    myFile.write("\n====================================================================================================================================================================");
                }
                else{
                        System.out.println("Please Enter Valid key: SignUp");
                    }
                myFile.close();
                } catch (IOException e) {
                    System.out.println("please try again...");
                }
                    break;
                    case "Login", "login", "LOGIN", "LogIn", "Log in":
                        FileReader reader= null;
//                        try {
//                            ;
//                        } catch (IOException e) {
//                            System.out.println("Enter valid key");
//                        }


                }




        }
    }

