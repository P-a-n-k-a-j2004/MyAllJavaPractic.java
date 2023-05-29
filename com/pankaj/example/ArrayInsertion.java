package com.pankaj.example;
import java.util.*;

import static java.lang.System.exit;

public class ArrayInsertion {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {

        Scanner sc = new Scanner(System.in);
        int size;

        System.out.println("Enter Array Size , How many long you want to your Array:");
        size = sc.nextInt();
        int[] arr = new int[size];
        int [] arr2=new int[size-1];
        System.out.println("Enter any number you want to store in Array:");

            for (int i = 0; i < size; i++) {

                arr[i] = sc.nextInt();
            }

for(;;){
    System.out.println("press 1. for search an value,\n 2. for delete an element in array \n 3. for display \n 4. for exit");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();

        switch (choice) {


            case 1:
                System.out.println("Your choice is 1 for search value in array:");
                System.out.println("Enter Any value you want to search in array:");
                int search = sc.nextInt();
                for (int i = 0; i < size; i++) {
                    if (arr[i] == search) {

                        System.out.println("Your searching value is found in Array the value is" + search);

                    }

                } break;

            case 2: System.out.println("This is for Deleting an value in Array from user:");
                System.out.println("Enter which number index you want to remove:");
                int remove=sc.nextInt();
                for(int i=0; i<size; i++){
                    if(i<remove){
                        arr2[i]=arr[i];
                    }
                    else if(i==remove){
                        continue;
                    }
                    else{
                        arr2[i-1]=arr[i];
                    }

                }System.out.println("Your Deleted index  is -  " + remove);
                break;
            case 3: System.out.println("This is for Display Array element here:");
                for(int i=0; i<size-1; i++){
                    System.out.println(arr2[i]);
                }break;

            case 4: System.out.println("Okay Bay..Haven a nice day");
                    exit(0);
                    break;
            default:System.out.println("You are not write.....");

        }}
//            for (int i = 0; i < size; i++) {
//
//                System.out.print(arr[i]);
//            }
        }

    }

