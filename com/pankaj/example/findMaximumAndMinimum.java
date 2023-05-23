package com.pankaj.example;

import java.util.*;
public class findMaximumAndMinimum {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the firs Value: ");
    int firstValue=sc.nextInt();

    System.out.println("Enter the second Value: ");
    int secondValue=sc.nextInt();
    System.out.println(" "+ Math.max(firstValue,secondValue) + "-> is Maximum Value");
    System.out.println( " " + Math.min(firstValue,secondValue) + "-> is Minimum Value");
    }
}
