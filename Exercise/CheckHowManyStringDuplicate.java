package com.prectice.udemy.Exercise;

public class CheckHowManyStringDuplicate {
    String str;
    CheckHowManyStringDuplicate(String str){
        this.str=str;
    }
    public int hasConsecutiveDuplicates() {
        int counter=0;

        if(str.isEmpty() || str.length()==1){
            return counter;
        }
        //ends is local variable , this indicating how many times for loop is running, it is a condition
        int ends=str.length()-1;
        //here loop will start from 0 and ends on length -1
        for(int starts=0; starts<ends; starts++){
            //firstIndex char is start from 0 and compare with the next SecondIndex
            //if firstIndex and SecondIndex character is same then increase counter value 0 to 1 and so on.
            char firstIndex=str.charAt(starts);
            //if   SecondIndex and firstIndex  character is same then increase counter value 0 to 1 and so on.
            //firstIndex char is start from 1 and compare with the next SecondIndex and always after for loop is
            //execute is increase by one again and again.

            char secondIndex=str.charAt(starts+1);
            if(firstIndex==secondIndex){
            //counter is a local variable, or it is use for count all duplicate value s
                counter++;

             //this code is only print name of character which is duplicate
              char whichString=firstIndex=secondIndex;
                System.out.println("Duplicate value: "+whichString);
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        CheckHowManyStringDuplicate check=new CheckHowManyStringDuplicate("Pankaj");
        System.out.println(check.hasConsecutiveDuplicates());
    }
}
