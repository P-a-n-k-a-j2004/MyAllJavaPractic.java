package com.prectice.udemy.Exercise;

public class CheckTriangleMyCode {
        public boolean isValidTriangle(int angle1, int angle2, int angle3) {
            // write your code here
            if(angle1<=0||angle2<=0||angle3<=0){
                return false;
            }
            int result=angle1+angle2+angle3;
            if(result==180){
                return true;
            }

            return false;
        }

    public static void main(String[] args) {
        CheckTriangleMyCode code=new CheckTriangleMyCode();
        System.out.println(code.isValidTriangle(90,45,45));
    }
    }
