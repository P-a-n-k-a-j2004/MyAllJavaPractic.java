package com.prectice.udemy.Exercise;

public class CountHowManyUpperCaseTeacher {
   String str;
    CountHowManyUpperCaseTeacher(String str){
        this.str=str;
    }
    public int countUpperCase(){
      int counter=0;
      if(str.isEmpty()){
          return counter;
      }
      for(int starts=0; starts<str.length(); starts++){

          //here if condition is check which character is uppercase and starts from index zero(0)
          if(Character.isUpperCase(str.charAt(starts))){
              //if condition find an uppercase in string then counter value is increasing by one
              System.out.println(str.charAt(starts));
              counter++;
          }
      }
        return counter;
    }
    public static void main(String[] args) {
        CountHowManyUpperCaseTeacher countHowManyUpperCaseTeacher=new CountHowManyUpperCaseTeacher("PANKAJ");
       System.out.println( countHowManyUpperCaseTeacher.countUpperCase());
    }
}
