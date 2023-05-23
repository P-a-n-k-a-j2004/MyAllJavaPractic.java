package com.pankaj.example;

import java.util.*;

public class findThirdAngleOfTriangle {

    public static void main(String [] args){
//        Scanner sc= new Scanner(System.in);
        findThirdAngleUsing();
//        System.out.print("Enter the value of  First Angle value:");
//        int firstAngle=sc.nextInt();
//        System.out.print("Enter the value of Second Angle value:");
//        int secondAngle=sc.nextInt();
//
//        int sum= firstAngle + secondAngle;
//
//        System.out.print("The Third Angle value is :");
//        int thirdAngle=180-sum;
//        System.out.print(thirdAngle);
//        HashMap<String,Integer>map=new HashMap<>();
//        map.put("\n\nFirst Angle value:",firstAngle);
//        map.put("Second Angle value:",secondAngle);
//        map.put("Third Angle value: ",thirdAngle);
//        System.out.println(map);
    }

public static void findThirdAngleUsing(){
    Scanner sc= new Scanner(System.in);

    System.out.print("Enter the value of  First Angle value:");
    int firstAngle=sc.nextInt();
    System.out.print("Enter the value of Second Angle value:");
    int secondAngle=sc.nextInt();

    int sum= firstAngle + secondAngle;

    System.out.print("The Third Angle value is :");
    int thirdAngle=180-sum;
    System.out.print(thirdAngle);
    HashMap<String,Integer>map=new HashMap<>();
    map.put("\n\nFirst Angle value:",firstAngle);
    map.put("Second Angle value:",secondAngle);
    map.put("Third Angle value: ",thirdAngle);
    System.out.println(map);
}
}