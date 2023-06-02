package com.pankaj.example;

public class PrintMyName {
    public static void main(String [] args){
        int size=4;

        for(int row=1; row<=size; row++){
            for(int col=1; col<=size; col++){
                if(row==1 || row==size||col==1 ||col==size ){
                    System.out.print("*");
                }else
                        System.out.print(" ");
                System.out.print(" ");
            }System.out.println();
        }
        for(int row=1; row<=size; row++){
            for(int col=1; col<=size; col++){
                if(col==1 || col==size){
                    System.out.print("*");
                }else
                    System.out.print(" ");
                System.out.print(" ");
            }System.out.println();
        }


//        for(int row=1; row<=size; row++){
//            for(int col=1; col<=size; col++){
//                if(col==row || col==1 || col==4){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }System.out.print(" ");
//            }System.out.println();
//        }




    }
}
