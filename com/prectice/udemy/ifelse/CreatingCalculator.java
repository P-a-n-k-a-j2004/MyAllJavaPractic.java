package com.prectice.udemy.ifelse;

import java.util.Scanner;

public class CreatingCalculator {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first=sc.nextInt();
        System.out.println("Enter Second number: ");
        int second=sc.nextInt();
        System.out.println("-> add");
        System.out.println("-> sub");
        System.out.println("-> multi");
        System.out.println("-> divide");
        System.out.println("Choose an operator: ");
        char op=sc.next().charAt(0);

        if (op =='+') {

            System.out.println("Addition: "+ (first+second));
        }
        else if(op =='-'){
            System.out.println("Subtraction: "+ (first-second));
        }
        else if(op =='*'){
            System.out.println("Multiplication: "+ (first*second));
        }
        else if(op =='/'){
            System.out.println("Division: "+ (first/second));
        }
        else{
            System.out.println("This Operation is not define please try again..");
        }
    }
}
