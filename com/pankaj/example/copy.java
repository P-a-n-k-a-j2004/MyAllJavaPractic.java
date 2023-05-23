package com.pankaj.example;

public class copy {
    public static void main(String[] args){
        copyConstructor copyData= new copyConstructor();
        copyConstructor copyData2=new copyConstructor(copyData);
    }

}
class copyConstructor{
    int a;


    copyConstructor(){
        a=50;
        System.out.println("The value of a is ="+ a);
    }
    copyConstructor(copyConstructor ref){
      int  p= ref.a;
        System.out.println("Value of copy constructor="+p);

    }
}
