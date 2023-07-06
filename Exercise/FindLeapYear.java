package com.prectice.udemy.Exercise;

public class FindLeapYear {
    public boolean isLeapYear(int year){
        // Validation for year: if year is less than equals to 0 than it return false
        if(year <=0){
            return false;
        }
        //here we will check if year is not divisible by 4 than it is not leap year and return false
        if(year % 4!=0){
            return false;
        }
        //here we will check if year is divisible by 4 and not divisible by 100 it knows as leap year and return true
//        if(year % 4 ==0 && year % 100 !=0){ // you can do in simple way
        if(year % 100 !=0){
            return true;
        }
        //here we will check if year is divisible by 4 and divisible by 100 then condition is true and go in  side the if
//        if(year % 4==0 && year % 100==0){// you can do in simple way

            //here we will check year is divisible by 400 condition true  then is knows as leap year
            if(year % 400 ==0) {
                return true;
            }
            //if condition is false then else statement is executes


        return false;
    }
    public static void main(String[] args) {
        FindLeapYear leapYear=new FindLeapYear();
        System.out.println(leapYear.isLeapYear(2004));

    }
}
