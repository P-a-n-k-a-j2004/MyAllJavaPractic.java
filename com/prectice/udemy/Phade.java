package com.prectice.udemy;
import java.util.*;
public class Phade {
    public static void main(String [] args){
       for(; ;) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter an number you want to print multiply 10 time and print phade");
           int myNumber = sc.nextInt();
           int n = 10;
           System.out.println("Result\n");
           for (int i = 1; i <= n; i++) {
               System.out.println(myNumber + " * " + i + " = " + myNumber * i);
               //System.out.println(i);
           }
       }
    }
}
