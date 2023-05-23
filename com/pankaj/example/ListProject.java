package com.pankaj.example;
import java.util.*;
import java.util.Scanner;
import java.util.InputMismatchException;



public class ListProject {

 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your password:");
     String myPassword=sc.nextLine();
    String name="pankaj";
     if(myPassword.equals(name)){
         System.out.println(" Correct Password enter the main file");

     }
     else{
         System.out.println("Your password is wrong");
     }


//     TreeSet<String> MyHash = new TreeSet<>();
//     HashMap<String, Integer> map=new HashMap<>();
     LinkedHashMap<String, Integer> map=new LinkedHashMap<>();

int n=5;

  for(int i=1; i<=n; i++) {
      try {
          String myNames = sc.nextLine();
          int values = sc.nextInt();
          map.put(myNames, values);

      }
      catch(InputMismatchException e){

        System.out.println("Please enter valid expretion like name and value:");
      }

  }
     System.out.println(map);


 }







 }