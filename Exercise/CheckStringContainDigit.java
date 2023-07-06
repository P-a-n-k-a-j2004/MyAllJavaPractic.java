package com.prectice.udemy.Exercise;

import java.util.concurrent.Callable;

public class CheckStringContainDigit {
    /*
     *
     * This method finds the rightmost digit in a given string.
     *
     * @param str The string to find the rightmost digit in.
     * @return The rightmost digit in the string. If no digit is found, return -1.
     */
    public int getRightmostDigit(String str) {
        int digit=0;
        for(int start=str.length(); start>=0;start++){
            digit=start;
            char lastIndex=str.charAt(start);
            char secondLast=str.charAt(start-1);
            if(lastIndex==secondLast){
                char newIndex=lastIndex=secondLast;
                if(newIndex== digit){
                    return digit=(int)str.charAt(start);
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        CheckStringContainDigit checkContainDigit=new CheckStringContainDigit();
        System.out.println(checkContainDigit.getRightmostDigit("pank20034aj"));


            }
        }
