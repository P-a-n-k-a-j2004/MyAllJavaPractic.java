package com.prectice.udemy;

import java.util.*;
public class multiplySpecialWay {
    public static void main(String [] args){


    Scanner sc=new Scanner(System.in);

    System.out.println("Enter how many value multiply with self:");
    int selfValue=sc.nextInt();
        System.out.println("Multiply with each other..");
    for(int i=1; i<=selfValue; i++){
        System.out.println("Multiply " + i + " * " + i + " = " + i*i);

    }

    }
}
