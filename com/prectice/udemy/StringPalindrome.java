package com.prectice.udemy;

import java.io.*;

//This is not working
public class StringPalindrome {
    int isPalindrome(String s){
    String revers = "";
    for(int i=s.length()-1; i>=0; i++){
        revers=revers+s.charAt(i);
    }
     if(s.equals(revers)){
         System.out.println("yes");
         return 1;
            }
     else{
            System.out.println("No");
            return 0;

        }


    }
    public static void main(String [] args) throws IOException {
        BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an how many string here:");
        int t=Integer.parseInt(scan.readLine());
        while(t-->0){
            String s=scan.readLine();
            StringPalindrome mm=new StringPalindrome();
            System.out.println(mm.isPalindrome(s));
        }



    }
}
