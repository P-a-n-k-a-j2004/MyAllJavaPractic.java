package com.pankaj.example;

import java.util.*;
public class findSqurs {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter how many value you want to multiply by given value:");
        int numberOfTime=sc.nextInt();
        System.out.print("Enter an Value you want to find square rute : ");
        int squareRute=sc.nextInt();
//        System.out.println("The Square Rute of given value is :> " + (squareRute*squareRute));
        for (int i=1; i<=numberOfTime; i++){
            System.out.println("given value is - "+ squareRute + " * "  +  i  + "  =  " + squareRute * i);
        }
    }
}
