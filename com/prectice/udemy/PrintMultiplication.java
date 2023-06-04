package com.prectice.udemy;
import java.util.*;
public class PrintMultiplication {


    public void creation(int data,int from,int to){
        for(from=1; from<=to; from++){
            System.out.println("Result:" + data + " *" + from + " = " + data * from);
            System.out.printf("Result: %d * %d = %d",data,from,data*from ).println();
        }
    }
    public static void main(String [] args){
    Scanner sc = new Scanner (System.in);

    int data; int from; int to;
    System.out.println("Enter you want to multiply each value");
    data=sc.nextInt();
    System.out.println("Enter any value you want to start multiply each value:");
    from=sc.nextInt();
    System.out.println("Enter any value you want to end multiply each value: ");
    to=sc.nextInt();

        double datas=Math.random();
        double froms=Math.random();
        double tos=Math.random();
        System.out.println(datas);
        System.out.println(froms);
        System.out.println(tos);
        PrintMultiplication my =new PrintMultiplication();
        my.creation(data,from,to);
    }
}
