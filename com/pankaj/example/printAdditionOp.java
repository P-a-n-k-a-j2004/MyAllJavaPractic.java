package com.pankaj.example;

public class printAdditionOp {
    public static void main(String [] args){
        int size=6;
        for(int row=1; row<size; row++){
            for(int col=1; col<size; col++){
             if(row==3 || col==4) {
                    System.out.print(" *");
                }else{
                    System.out.print(" ");
                }System.out.print(" ");
            }System.out.println();
        }
    }
}
