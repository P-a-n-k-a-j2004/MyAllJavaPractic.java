package com.pankaj.example;

public class printTwo {
    public static void main(String [] args){
        int size=4;
        for(int row=1; row<=size; row++){
            for(int col=1; col<=size; col++){
                if (row == 1 || row == size || col == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }System.out.print(" ");

            }System.out.println();
        }
        for(int row =1; row<=size; row++){
            for(int col=1; col<=size; col++){
                if (row == size || col == 1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }System.out.print(" ");
            }System.out.println();
        }

    }
}
