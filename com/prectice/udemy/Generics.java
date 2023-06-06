package com.prectice.udemy;
import java.lang.Integer;
public class Generics {
    public static void main(String [] args){


        Integer [] intArray={1,2,3,4,5,6,7,8,9,10};
        Double [] doubleArray={1.1, 2.2,3.3,4.4,5.5,6.6,7.7,8.8};
        Character[] charArray={'H','E','L','L','O'};
        String [] stringArray={"B","O","y"};



        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);


    }
//    public static void displayArray(Integer [] array){
//        for(Integer i:array){
//            System.out.println(i);
//
//        }System.out.println();
//    }
public static <Thing>void displayArray(Thing [] array){
    for(Thing i:array){
        System.out.print(i +" ");

    }System.out.println();
}
}
