package com.prectice.udemy.Exercise;

public class CheckTheNumberIsPrefectMyCode {


        public boolean isPerfectNumber(int number) {
//Here Validation for number: if number is less than 0 and negative value is not accept
            if (number < 0) {
                return false;
            }
            //here before loop value of sum is 0
            int divisor = 0;
            // after loop
            for (int i = 1; i < number; i++) {
                // If the number is divisible by i (i is a divisor), add i to the sum
                if (number % i == 0) {
                    divisor += i;
                }

            }
//            if(number==divisor){ //This code is right buts I simplify this code  bellow the comments...
//                return true;
//            }
//            return false;
//        }
            // After the loop, if the sum of divisors equals the input number,
            // the number is perfect. Return true in this case. Otherwise, return false.
            return number == divisor;
        }

    public static void main(String[] args) {
        CheckTheNumberIsPrefectMyCode checkTheNumberIsPrefect=new CheckTheNumberIsPrefectMyCode();
        System.out.println(checkTheNumberIsPrefect.isPerfectNumber(28));
    }
    }

