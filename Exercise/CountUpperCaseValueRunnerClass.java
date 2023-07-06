package com.prectice.udemy.Exercise;



public class CountUpperCaseValueRunnerClass extends  CountUpperCaseValueSubClass{

    public CountUpperCaseValueRunnerClass(String str) {
        super(str);
    }

    public static void main(String[] args) {
        CountUpperCaseValueRunnerClass count=new CountUpperCaseValueRunnerClass("Pankaj");
        count.checkAllUpperCase();
        System.out.println(count.getHowManyUpperCase());

    }

}
