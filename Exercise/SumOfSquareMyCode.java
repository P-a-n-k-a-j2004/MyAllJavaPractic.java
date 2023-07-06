package com.prectice.udemy.Exercise;

public class SumOfSquareMyCode {
    public long calculateSumOfSquares(int n) {
        // write your code here
        if(n<0){
            return -1;
        }
        int summation=0;
        int square=0;
        for(int loop=1; loop<=n; loop++){
            square=loop *loop;
            System.out.println("Squares: "+loop+" ka "+square);
            summation+=square;
            System.out.println("summation of all Squares: "+summation);
        }
        return summation;
    }

    public static void main(String[] args) {
        SumOfSquareMyCode sumOfSquare=new SumOfSquareMyCode();
        System.out.println(sumOfSquare.calculateSumOfSquares(3));
    }
}

