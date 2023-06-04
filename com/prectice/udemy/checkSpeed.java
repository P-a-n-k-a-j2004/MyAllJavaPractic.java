package com.prectice.udemy;

public class checkSpeed {

    public int speed;
    public static void main(String [] args){
        checkSpeed honda = new checkSpeed();

        honda.speed=200;

        System.out.println("First task");

        checkSpeed tvs= new checkSpeed();

        tvs.speed=70;


        System.out.println("This speed is honda speed" + honda.speed);
        System.out.println();


        System.out.println("This speed is TVS speed:"+ tvs.speed);


    }
}
