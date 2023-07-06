package com.prectice.udemy.Exercise;

public class ExamResult {


        public boolean isPass(int marks) {

            // Update Code : If the student's marks are greater than 50, they have passed the exam.
            if(marks > 50){
                return true;
            }

            return false;
        }

    public static void main(String[] args) {
        ExamResult result=new ExamResult();
        System.out.println(result.isPass(40));
    }
    }

