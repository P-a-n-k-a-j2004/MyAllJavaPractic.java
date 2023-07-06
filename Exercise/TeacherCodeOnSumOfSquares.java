package com.prectice.udemy.Exercise;

public class TeacherCodeOnSumOfSquares {

        public long calculateSumOfSquares(int n) {
            // write your code here
            if(n<0){
                return -1;
            }
            int summation=0;
            for(int loop=1; loop<=n; loop++){
                summation+=loop*loop;
                System.out.println("summation: "+summation);
            }
            return summation;
        }

        public static void main(String[] args) {
            TeacherCodeOnSumOfSquares sumOfSquare=new TeacherCodeOnSumOfSquares();
            System.out.println(sumOfSquare.calculateSumOfSquares(3));
        }
    }

