package com.Youtube.FileHandling;

import java.util.*;
import java.io.*;
import java.io.File;

public class UsingArrayStoreValue{
    public static void main(String[] args)throws FileNotFoundException,IOException{
        Scanner sc = new Scanner(System.in);

        String [] array;
        long [] arr;



        try{FileWriter writer = new FileWriter("UserArray.txt");
            System.out.println("Enter How Many Value you want to enter:");
          int howManyValue=sc.nextInt();
            array=new String[howManyValue];
             arr=new long[howManyValue];
            writer.write("====================================================================");
            writer.write("\n\tName:"+"   \t\t||\t"+"\tMobil.NO:");
            // writer.write();
            writer.write("\n====================================================================");
            for(int i=0; i<=howManyValue-1; i++){
               System.out.println("Enter What do you want to store like this String ,value: ");

                sc.nextLine();
                array[i]=sc.nextLine();

                arr[i]=sc.nextLong();
                   /* writer.write("====================================================================");
                    writer.write("\n\tName:"+"\t\t||\t"+"\tMobil.NO:");
                 // writer.write();
                    writer.write("\n====================================================================");*/

                    writer.write("\n\n\t"+array[i] +"\t\t\t\t"+arr[i]);
                    writer.write("\n====================================================================");

            }

        writer.close();
    }catch (IOException e){
            e.getStackTrace();
            throw new InputMismatchException();
        }
    }
}
