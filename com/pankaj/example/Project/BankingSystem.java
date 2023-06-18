package com.pankaj.example.Project;


import java.util.Scanner;

public class BankingSystem {
    private String name;
    private int id;
    private long acc;
    private long balance;
//    BankingSystem(String Name,int Id,long Acc,long Balance){
//
//        this.name=Name;
//        this.id=Id;
//        this.acc=Acc;
//        this.balance=Balance;
//    }
    public String setName(String name){
        this.name=name;
        return getName();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int setId(int id) {
        this.id = id;
        return getId();
    }

    public long getAcc() {

        return acc;
    }

    public long setAcc(long Acc) {

        this.acc = Acc;

        return getAcc();
    }

    public long getBalance() {
        return balance;
    }

    public long setBalance(long balance) {
        this.balance = balance;
        return getBalance();
    }

    public static void main(String [] args){

        Scanner scan=new Scanner(System.in);
        String name;
        int id;
        long acc;
        long balance=75000l;


        System.out.print("Enter Your Name: ");
        name=scan.nextLine();
        System.out.print("Enter Your Id: ");
        id=scan.nextInt();
        System.out.print("Enter Your Account no: ");
        acc=scan.nextLong();

            BankingSystem userData1 = new BankingSystem();
            //BankingSystem userData1 = new BankingSystem("pankaj", 45849, 7878787878787l, 78798798l);

//        if(userData1.getAcc()>0 && userData1.getAcc()<13){
//            System.out.println("Sorry your Account Number is not exist . \nplease Enter valid Account number..");
//        }else {
        String myName = userData1.setName(name);
        int myId = userData1.setId(id);
        long myAcc = userData1.setAcc(acc);
        long myBalance = userData1.setBalance(70000);
        if(userData1.getAcc()>0 && userData1.getAcc()<13){
            System.out.println("Sorry your Account Number is not exist . \nplease Enter valid Account number..");
        }

             myName = userData1.getName();
            myId = userData1.getId();
            myAcc = userData1.getAcc();
             myBalance = userData1.getBalance();


            System.out.println("\n\t\t======================================================================================================");
            System.out.print("\t\t||");
            System.out.print("\t|      Name      |");
            System.out.print("\t|      Id      | ");
            System.out.print("\t|      Account no.      |");
            System.out.print("\t|      Balance      |");
            System.out.print("\t\t||");

            System.out.println("\n\t\t======================================================================================================");
            System.out.print("\t\t||");
            System.out.print("\t     " + myName + "     ");
            System.out.print("\t     " + myId + "      ");
            System.out.print("\t       " + myAcc + "       ");
            System.out.print("\t        " + myBalance + "        ");
            System.out.print("\t\t||");
            System.out.println("\n\t\t======================================================================================================");

//        }
    }
}
//name
//id
//acc
//clone
// Add
//Bal

//6 man
//previous data in obj format colm should be name,email,phone,age,contury;
