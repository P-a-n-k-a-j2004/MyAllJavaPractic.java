package com.prectice.udemy;

public class IncreaseDecreaseMethod {
    private int Speed;
    public void setSpeed(int speed){
        if( speed > 0) {
            this.Speed = speed;
        }else{
            System.out.println("null");
        }
    }
    public int getSpeed(){
        return Speed;
    }
//    public void increase(int howMuch){     //we make new method using another way
//        this.Speed+=howMuch;
//    }
//    public void Decrease(int howMuch){            //we make new method using another way
//        this.Speed-=howMuch;
//    }


    public void increase(int howMuch){
        setSpeed(this.Speed+howMuch);
    }
    public void decrease(int howMuch){
        setSpeed(this.Speed-howMuch);
    }
}
