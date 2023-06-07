package com.Youtube.Practice;

public class MyFirstMultiThreading {
    public static void main(String[] args){
        new Thread1().start();
        try {
            new Thread1().sleep(10);
            new Thread2().sleep(20);
            new Thread3().sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        new Thread2().start();

        new Thread3().start();

        new Thread4().start();
        System.out.println("I am in the Main Method! ");
    }
}
class Thread1 extends Thread{
    public void run(){
        System.out.println("I am in the Thread1 run Method !");
    }
}
class Thread2 extends Thread{
    public void run(){
        System.out.println("I am in the Thread2 run Method !");
    }
}
class Thread3 extends Thread{
    public void run(){
        System.out.println("I am in the Thread3 run Method !");
    }
}
class Thread4 extends Thread{
    public void run(){
        System.out.println("I am in the Thread4 run Method !");
    }
}
