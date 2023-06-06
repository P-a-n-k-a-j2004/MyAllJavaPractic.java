package com.prectice.udemy;


import java.util.Scanner;

public class MakeStrongGenerics{

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        GenericsConstructor <Integer> myConstructor=new GenericsConstructor<>(3);
        GenericsConstructor <String> myConstructor2=new GenericsConstructor<>(" pankaj");
        System.out.println(myConstructor.get(50));
        System.out.println(myConstructor.get(60));
        System.out.println(myConstructor.get(70));
        System.out.println(myConstructor.get(80));
        System.out.println(myConstructor.get(90));


        System.out.println(myConstructor2.get("pankaj"));
        System.out.println(myConstructor2.get("Is"));
        System.out.println(myConstructor2.get("Good Man!"));

        new GenericsConstructor<String>("I am good!");
        new GenericsConstructor<Integer>(45);

    }
}
