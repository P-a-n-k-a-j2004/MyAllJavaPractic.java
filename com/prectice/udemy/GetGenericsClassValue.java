package com.prectice.udemy;

public class GetGenericsClassValue {
    public static void main(String[] args){
        MyGenericsClass<Integer> myInt=new MyGenericsClass<>(1);
        MyGenericsClass<Double> myDouble=new MyGenericsClass<>(5.5);
        MyGenericsClass<Character> myChar=new MyGenericsClass<>('@');
        MyGenericsClass<String> myString=new MyGenericsClass<>("Hello");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
    }
}
