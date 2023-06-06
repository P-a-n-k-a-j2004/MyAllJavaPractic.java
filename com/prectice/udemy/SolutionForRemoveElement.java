package com.prectice.udemy;

import java.util.Scanner;

public class SolutionForRemoveElement {

    public int removeElement(int [] nums, int val){
        int arrLength=nums.length;
        int start=0;
        while(start < arrLength){
        if(nums[start]==val){
            nums[start]=nums[arrLength];
            arrLength--;
        }
        start++;
        }
        return arrLength;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int[] num=new int[5];
        for(int i=0; i<num.length;i++){
             num[i]=sc.nextInt();
        }

        System.out.println("Enter value");
        int value=sc.nextInt();
        SolutionForRemoveElement sfre=new SolutionForRemoveElement();
        sfre.removeElement(num,value);
    }
}
