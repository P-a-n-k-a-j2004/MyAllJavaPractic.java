package com.prectice.udemy;

public class MyGenericsClass <Thing>{
    Thing x;
    MyGenericsClass(Thing x){
        this.x=x;
    }
    public  Thing getValue(){
        return x;
    }
}
