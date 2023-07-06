package com.prectice.udemy.Exercise;

public class TriangleIsValidTeacherCode {
    public boolean isRightAngled(int side1, int side2, int side3) {
        // check if any side length is non-positive
        if(side1<=0||side2<=0||side3<=0){
            return false;
        }
        // check each combination of sides to see if Pythagorean theorem holds
        if(side1*side1==side2*side2+side2*side2){
            return true;
        }
        if(side2 * side2==side1*side1+side3*side3){
            return true;
        }
        if (side3*side3==side1*side1+side2*side2){
            return true;
        }
        // if none of the combinations hold, it's not a right-angled triangle
        return false;
    }

    public static void main(String[] args) {
        TriangleIsValidTeacherCode teacherCode=new TriangleIsValidTeacherCode();
        System.out.println(teacherCode.isRightAngled(3,4,5));
        //5 *  5 = = 3 * 3 + 4 * 4;
        //25 = = 9 + 16
        //25 = = 25 This is right angle and return true
    }
}
