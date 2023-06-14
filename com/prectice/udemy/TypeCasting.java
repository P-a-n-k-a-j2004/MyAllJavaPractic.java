package com.prectice.udemy;

public class TypeCasting {
    public static void main(String [] args) {
//        int eight=0xABCDEF;
//        System.out.println(eight);
//        int ten=0xF;
//        System.out.println(ten);

        int i=840385;
       // short j=i;//here Show an error
    short j=(short) i;
    long r=i;
    double d=i;
    //float f=d;//Then casting here
        float f=(float)d;

    System.out.println(d);
    System.out.println(r);
    System.out.println(i);
    System.out.println(j);
    System.out.println(f);
    }
}
