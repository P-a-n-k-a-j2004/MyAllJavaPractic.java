package com.Youtube.FileHandling;
import java.io.*;
import java.util.*;
public class MyFirstFile {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

      /*  File file=new File("MyFirstFile.txt");
        file.createNewFile();*/
        try {  FileWriter fileWriter=new FileWriter("MyFirstFile.txt");

        fileWriter.write("OKay This is my First File..");

          System.out.println("Enter your name:");
          String name = sc.nextLine();
          System.out.println("Enter Your Last Name: ");
          String lastName = sc.nextLine();

          System.out.println("Enter Your Mobile Number: ");
          long myNumber = sc.nextLong();
         // String.valueOf((long)myNumber);
          fileWriter.write("\nYour First Name is :" + name);
          fileWriter.write("\nYour Last Name is :" + lastName);
          fileWriter.write("\nYour Mobile Number: "+ myNumber);



          fileWriter.close();
      }catch(IOException e){
          e.getStackTrace();
        }


    }
}
