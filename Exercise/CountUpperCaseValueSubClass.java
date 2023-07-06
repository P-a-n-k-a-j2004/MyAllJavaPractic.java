package com.prectice.udemy.Exercise;

public class  CountUpperCaseValueSubClass {
    String Str;
    int counter=0;
    public  CountUpperCaseValueSubClass(String str){
        this.Str=str;

    }
    public void checkAllUpperCase(){
        for(int start =0; start<Str.length(); start++){
            char checkUpperCase=Str.charAt(start);
            if(Character.isUpperCase(checkUpperCase)){
                counter++;
            }
        }
    }
    public int getHowManyUpperCase(){
        if (Str.isEmpty()) {return 0;}
        return counter;
    }
}
