package com.pankaj.example;
import java.util.*;

class firstClass
{

    protected int  a;
    protected int b;
     Scanner sc1=new Scanner (System.in);
    public void firstClassData(){
        System.out.println("Enter the value of A=");
        a=sc1.nextInt();
        System.out.println("Enter the value of B=");
        b=sc1.nextInt();

    }
}
class secondClass extends firstClass
{

    protected int c;

    public void secondClassData(){
        System.out.println("Enter the value of C =");
        c=sc1.nextInt();


    }
    public void ChangefirstData(){
        System.out.println("Enter the value of A you want to change=");
        a=sc1.nextInt();
        System.out.println("Enter the value of B You want to change=");
        b=sc1.nextInt();
    }
}
class thirdClass extends secondClass
{
    protected int d;


    public void thirdClassData(){
        System.out.println("Enter the value of D=");
        d=sc1.nextInt();


    }
    public void changeSecondData(){
        System.out.println("Enter the Value in C you want to change=");
        c=sc1.nextInt();
    }
}
class AccessAllData extends thirdClass
{
    Scanner sc1;
    public void DisplayAllData(){

        System.out.println("This is first class Data i will display you.....");
        System.out.println("Value of A in first class :"+a);
        System.out.println("Value of B in first class :"+b);
        System.out.println("Value of C in second class :"+c);
        System.out.println("Value of D in third class :"+d);


}
public void DisplayChangeData(){
         System.out.println(" After changing the value of A in second class then :"+a);
         System.out.println(" After changing the value of B in second class then :"+b);
         System.out.println(" After changing the value of C in third class then  :"+c);
}
}


public class multiPathInherit {
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        AccessAllData allData=new AccessAllData();
        AccessAllData changeData=new AccessAllData();



        for(; ; ){
            System.out.println("\n\nEnter Your choice which class you want to display");
            System.out.println("Press 1. first class Data\n 2.second class Data\n 3. third class Data\n 4. Display All Data");
            System.out.println("You want to change the value all class then agein press \n 5. for change first class" +
                    "\n 6. for change second class\n  7. for Display all changing Data\n  ");
            int choice=sc.nextInt();
            switch(choice){
                case 1: allData.firstClassData(); break;
                case 2: allData.secondClassData();break;
                case 3: allData.thirdClassData();break;
                case 4: allData.DisplayAllData();break;
                case 5: changeData.ChangefirstData();break;
                case 6: changeData.changeSecondData();break;
                case 7: changeData.DisplayChangeData();break;
                default:System.out.println(" Sorry your Enter value is not found please enter valid value");

            }
        }

    }
    }
