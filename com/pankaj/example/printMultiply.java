package com.pankaj.example;

public class printMultiply {
    public static void main(String[] args) {
        int size = 6;

        for(int row=1; row<size; row++){
            for(int col=1; col<size; col++){
                if(row==col || row+col==size){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }




    }
}