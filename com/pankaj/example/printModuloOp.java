package com.StarPatter.Practic;

public class printModuloOp {

public static void main(String [] args){
    int size=6;

    for(int row=1; row<size; row++){
        for(int col=1; col<size; col++){
            if(col==5 || row==1)
                 System.out.print(" *");
            else
                    System.out.print(" ");
        }System.out.println();
    }
}
}
