package com.prectice.udemy;
import java.io.*;

public class bufferReaderClass {
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter value of a :");
        int a=Integer.parseInt(br.readLine());
        System.out.println("Enter value of b :");
        int b=Integer.parseInt(br.readLine());
        int c= a+b;
        System.out.println("Result :" +c);
    }
}
