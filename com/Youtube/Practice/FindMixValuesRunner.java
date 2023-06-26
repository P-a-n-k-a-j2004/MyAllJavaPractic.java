package com.Youtube.Practice;

import java.util.Scanner;

public class FindMixValuesRunner {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value you want to check prime or not");
        number = sc.nextInt();

        FindMixValueSubClass whichValue = new FindMixValueSubClass(number);
        int checkingPOrNot= whichValue .isPrime();
      System.out.println("checking value: " +checkingPOrNot);
      int sumUpToNo= whichValue.sumUpToNumber();
      System.out.println("checking Sum up to number: "+sumUpToNo);

      int printAngle=whichValue.AngleOfNumber();
      System.out.println("Printing Angle here: "+printAngle);
      

    }

}

