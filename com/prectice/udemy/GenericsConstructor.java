package com.prectice.udemy;

import java.lang.*;

public class GenericsConstructor <Thing> {

    Thing x;

    GenericsConstructor(Thing value){
        this.x=value;
        System.out.println(x);
    }
    public Thing get(Thing value){
        this.x=value;
        return x;
    }
}
