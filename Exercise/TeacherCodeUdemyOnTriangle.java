package com.prectice.udemy.Exercise;

public class TeacherCodeUdemyOnTriangle {

        public boolean isValidTriangle(int angle1, int angle2, int angle3) {
            // here Validation all angles
            if(angle1<=0||angle2<=0||angle3<=0){
                return false;
            }
            //Here summition
            int result=angle1+angle2+angle3;
//            boolean SumOfAngleIs180=result==180;
//            return SumOfAngleIs180;
            return result==180;
        }

    public static void main(String[] args) {
        TeacherCodeUdemyOnTriangle teacherCodeUdemyOnTriangle=new TeacherCodeUdemyOnTriangle();
        System.out.println(teacherCodeUdemyOnTriangle.isValidTriangle(90,45,45));
    }

}
