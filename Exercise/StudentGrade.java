package com.prectice.udemy.Exercise;

public class StudentGrade {

        private int marks;

        public StudentGrade(int marks) {

            this.marks=marks;
        }

        public char assignGrade() {

            // If marks are less than 0 or greater than 100, return 'X'

            if(marks < 0 || marks > 100){
                return 'X';
            }
            // If marks are greater than or equal to 90, return 'A'
            if(marks>=90 ){
                return 'A';
            }
            // If marks are greater than or equal to 80, return 'B'
            // If marks are greater than or equal to 70, return 'C'
            // If marks are greater than or equal to 60, return 'D'
            // If marks are greater than or equal to 50, return 'E'
            // If marks are less than 50, return 'F'
            else if(marks>=80){
                return 'B';
            }
            else if(marks>=70){
                return 'C';
            }
            else if(marks>=60 ){
                return 'D';
            }
            else if(marks>=50){
                return 'E';
            }else if (marks >=1) {
                return 'F';
            }



            return 'Y';

        }


        public static void main(String[] args) {

         StudentGrade grade= new StudentGrade(90);
          System.out.println( grade.assignGrade());

        }
    }


