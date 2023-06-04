package com.prectice.udemy;

import java.util.Scanner;

public class speedIncresecs {
    public int speed;

    public int setSpeed(int set) {
        speed = set;
        return speed;
    }

    public int increaseSpeed(int howMuch) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter what do you want Increase or Decrease for Increase press 1 and Decrease press 2");
        int choice=sc.nextByte();
        if (choice == 1) {
            System.out.println("Here Increase Speed");
            speed = speed + howMuch;
            System.out.println(speed);
        } else if (choice == 2) {
            System.out.println("Here Decrease Speed");
            speed = speed - howMuch;
            System.out.println(speed);
        } else {
            System.out.println("You Enter wrong value");
        }
        return 0;
        }



    public static void main(String [] args){
        Scanner myScanner = new Scanner(System.in);

        speedIncresecs myData=new speedIncresecs();

        System.out.println("Enter how many speed you want to set");
        int setS=myScanner.nextInt();

        System.out.println("Enter how many Speed you want to increase or Decrease");
        int howMany=myScanner.nextInt();

        myData.setSpeed(setS);
        myData.increaseSpeed(howMany);

    }

    
}
